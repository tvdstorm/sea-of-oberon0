package oberon0.routines;

import java.util.ArrayList;

import oberon0.exceptions.IllegalVariableValueException;
import oberon0.exceptions.NotInScopeException;
import oberon0.variables.IReadableVar;
import oberon0.variables.ISelectorableVar;
import oberon0.variables.IWriteableVar;

/** A scope of variable:value pairs */
public class VariableSpace {
	
    private final String _name; // mainly for debugging purposes
    private ArrayList<IReadableVar> _variables;
    
    public VariableSpace(String spacename) { 
    	_name = spacename; 
    	_variables = new ArrayList<IReadableVar>();
    }
    
    public VariableSpace(VariableSpace anotherVarSpace) { 
    	_name = anotherVarSpace._name; 
    	_variables = anotherVarSpace._variables;
    }
    
    public IReadableVar get(String variableName) throws NotInScopeException{
    	IReadableVar foundVar = null;
    	for (IReadableVar currentVar: _variables){
    		String currentVarName = currentVar.getName();
    		if (currentVarName.equals(variableName)){
    			foundVar = currentVar;
    			break;
    		}
    	}
    	if (foundVar == null)
    		throw new NotInScopeException(variableName, _name);
    	return foundVar;
    }
    
    public IReadableVar getFromSource(String variableName) throws NotInScopeException{
    	IReadableVar foundVar = null;
    	for (IReadableVar currentVar: _variables){
    		String currentVarName = currentVar.getSourceName();
    		if (currentVarName.equals(variableName)){
    			foundVar = currentVar;
    			break;
    		}
    	}
    	if (foundVar == null)
    		throw new NotInScopeException(variableName, _name);
    	return foundVar;
    }
    
    public Boolean contains(String variableName){
    	IReadableVar foundVar = null;
    	for (IReadableVar currentVar: _variables){
    		String currentVarName = currentVar.getName();
    		if (currentVarName.equals(variableName)){
    			foundVar = currentVar;
    			break;
    		}
    	}
    	if (foundVar != null){
    		return true;
    	}
    	return false;
    }
    
    public void add(IReadableVar newVariable){
    	_variables.add(newVariable);
    }
    
    public void update(IReadableVar newValueVar) throws IllegalVariableValueException, NotInScopeException{
    	for (int varIndex=0; varIndex < _variables.size(); varIndex++){
    		IReadableVar currentVar = _variables.get(varIndex);
    		String currentName = currentVar.getName();
    		
    		if ((currentName.equals(newValueVar.getName())) && 
    				(currentVar.getType().equals(newValueVar.getType()))){
    			if (currentVar instanceof IWriteableVar){
    				_variables.set(varIndex, newValueVar);
    				return;
    			}
    			String valueText = newValueVar.getValue().toString();
    			throw new IllegalVariableValueException(valueText, currentName);
    		}
    	}
    	throw new NotInScopeException(newValueVar.getName(), getName());
    }

	public String getName() {
		return _name;
	}

	public void updateVariablesAfterRoutineCall(VariableSpace calledRoutineVariableSpace) throws NotInScopeException, IllegalVariableValueException {
		for(IReadableVar AnOldVariable: calledRoutineVariableSpace._variables){
			String varNameToUpdate = AnOldVariable.getSourceName();
			if (!varNameToUpdate.equals("")){
				IReadableVar currentVariable;
				if (contains(varNameToUpdate)){
					currentVariable = get(varNameToUpdate);
				}else {
					currentVariable = getFromSource(varNameToUpdate);
				}
				if (currentVariable instanceof ISelectorableVar){
					ISelectorableVar currentArray = (ISelectorableVar) currentVariable;
					currentArray.setValueAtSelector(AnOldVariable.getSourceSelector(), (IReadableVar)AnOldVariable);
					update((IReadableVar) currentArray);
				}
				else{
					((IWriteableVar) currentVariable).setValue(AnOldVariable.getValue());
					update(currentVariable);
				}
			}
		}
	}
}


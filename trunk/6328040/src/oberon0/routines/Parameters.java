package oberon0.routines;

import java.util.ArrayList;
import oberon0.variables.IReadableVar;

public class Parameters {
	
    private ArrayList<IReadableVar> _formalParams;
    private ArrayList<IReadableVar> _actualParams;
    
    public Parameters(String name, ArrayList<IReadableVar> formalParameterList){
		setFormalParams(formalParameterList);
	}
    
    public ArrayList<IReadableVar> getFormalParams(){
    	return _formalParams;
    }
    public IReadableVar getFormalParamAtIndex(int index){
    	return _formalParams.get(index);
    }
    public void setFormalParams(ArrayList<IReadableVar> params){
    	if (params!=null){
    		_formalParams = params;
    	}else{
    		_formalParams = new ArrayList<IReadableVar>();
    	}
    }
    public void setFormalParamsAtIndex(int paramIndex, IReadableVar param) {
		if (param != null){
			_formalParams.set(paramIndex, param);
		}
	}
    public int getFormalParamsSize(){
    	return _formalParams.size();
    }
    
    public ArrayList<IReadableVar> getActualParams(){
    	return _actualParams;
    }
    public IReadableVar getActualParamAtIndex(int index){
    	return _actualParams.get(index);
    }
    public void setActualParams(ArrayList<IReadableVar> params){
    	if (params!=null){
    		_actualParams = params;
    	}else{
    		_actualParams = new ArrayList<IReadableVar>();
    	}
    }


	
}

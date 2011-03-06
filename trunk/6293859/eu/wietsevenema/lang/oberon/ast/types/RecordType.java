package eu.wietsevenema.lang.oberon.ast.types;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import xtc.tree.Node;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;

public class RecordType extends VarType {

	private TreeMap<Identifier, VarType> elements;

	public RecordType(List<Node> list) {
		this.elements = new TreeMap<Identifier, VarType>();
		if (!list.isEmpty()) {
			for (Node node : list) {
				List<?> identList = (List<?>) node.get(0);
				VarType type = (VarType) node.get(1);
				for (Object object : identList) {
					Identifier id = (Identifier) object;
					this.elements.put(id, type);
				}
			}
		}
	}
	
	public RecordType(TreeMap<Identifier, VarType> elements){
		this.elements = elements;
	}
	
	public Set<Entry<Identifier,VarType>> entrySet(){
		return this.elements.entrySet();
	}
	
	public VarType get(Identifier id){
		return this.elements.get(id);
	}

	@Override
	public boolean equals(Object that) {
		if(that instanceof RecordType){
			RecordType thatRecord = (RecordType) that;		
			for (Map.Entry<Identifier, VarType> entry : this.elements.entrySet()){
				VarType entryThatType = thatRecord.get(entry.getKey());
				if(entryThatType == null || !entryThatType.equals(entry.getValue())){
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	


}

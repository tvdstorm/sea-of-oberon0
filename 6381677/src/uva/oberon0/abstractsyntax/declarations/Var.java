package uva.oberon0.abstractsyntax.declarations;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.ID;
import uva.oberon0.abstractsyntax.IDs;
import uva.oberon0.abstractsyntax.types.ArrayType;
import uva.oberon0.abstractsyntax.types.BaseType;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a Variable Declaration Node that is passed by Value.
*/
public class Var extends BaseDeclaration
{
	public Var(ID id, BaseType type)
	{
		super(id);

		_type = type;
	}
	public Var(IDs id, BaseType type)
	{
		super(id.get(0));

		_type = type;
		
		int alts = id.size() - 1;
		
		if (alts > 0)
		{
			_alternativeIDs = new ArrayList<ID>(alts);
			for (int i = 0; i < alts; i++)
			{
				_alternativeIDs.add(id.get(i + 1));
			}
		}
		//Determine and set IsArray field.
		//True when the first node after the IDs (3th last node) should be of the type ARRAY.
		//_isArray = parserTree.getChildCount() >= 4 && parserTree.getChild(parserTree.getChildCount() - 3).getType() == uva.oberon0.parser.OberonParser.ARRAY;
	}
	
	private BaseType _type = null;
	
	//A list of alternative ID nodes to determine if this variable can be split into multiple variable nodes.
	private ArrayList<ID> _alternativeIDs = null;
	
	/**
	 * Gets data Type of this Variable Declaration Node.
	 */
	public BaseType getType()
	{
		return _type;
	}
	

	@Override
	public boolean canSplit()
	{
		//Determine this node can be split based on ID.
		return _alternativeIDs != null && _alternativeIDs.size() > 0;
	}
	
	@Override
	public BaseNode split()
	{
		if (!canSplit())
			return null;
		
		ID resultID = _alternativeIDs.get(0);

		//Create clone as result node.
		Var result = new Var(resultID, _type);

		//Remove the first alternative ID;
		_alternativeIDs.remove(resultID);
		if (_alternativeIDs.size() == 0)
			_alternativeIDs = null;

		return result;
	}
	
	@Override
	public int eval(Scope scope) 
	{
		return 0;
	}
}

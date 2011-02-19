package randy.oberon0.ast.declaration;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;

public class AliasDeclaration extends AbstractTypeDeclaration
{
	private final String alias;
	private final String resolvesTo;
	
	public AliasDeclaration(String _alias, String _resolvesTo)
	{
		assert(_alias != null);
		assert(_alias.length() > 0);
		assert(_resolvesTo != null);
		assert(_resolvesTo.length() > 0);
		alias = _alias;
		resolvesTo = _resolvesTo;
	}
	@Override
	public void register(RuntimeEnvironment newEnvironment) throws RuntimeException
	{
		assert(newEnvironment != null);
		newEnvironment.registerType(alias, new AliasInstantiation(resolvesTo));
	}
}

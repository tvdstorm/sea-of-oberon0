package randy.ast;

/*
Object = POINTER TO ObjDesc;
ObjDesc = RECORD
name: Ident;
class: INTEGER;
type: Type;
next: Object;
val: LONGINT
END

TYPE
	Object
	POINTERTO
		ObjDesc
TYPE
	VAR
		Ident
		name
	VAR
		INTEGER
		class
	..
*/
public abstract class OAbstractTypeDeclaration extends OBodyDeclaration
{
	
}

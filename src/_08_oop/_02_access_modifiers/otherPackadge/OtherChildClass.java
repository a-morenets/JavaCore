package _08_oop._02_access_modifiers.otherPackadge;

import _08_oop._02_access_modifiers._package.ParentClass;

/**
 * Created by Maxim on 26.10.2016.
 */
public class OtherChildClass extends ParentClass {
	
	public void otherMethod() {
		int intValue;
		intValue = publicValue;
		intValue = protectedValue;
//		intValue = defaultValue;
		intValue = getDefaultValue();
//		intValue = privateValue;
		intValue = getPrivateValue();
	}

}

package _08_oop._02_access_modifiers.otherPackadge;

import _08_oop._02_access_modifiers._package.ParentClass;

/**
 * Created by Maxim on 26.10.2016.
 */
public class OtherClass {
	private int intValue;
	ParentClass parentClass = new ParentClass();

	public void setPublicValue() {
		this.intValue = parentClass.publicValue;
	}

	public void setProtectedValue() {
//		this.intValue = parentClass.protectedValue;
		this.intValue = parentClass.getProtectedValue();
	}

	public void setDefaultValue() {
//		this.intValue = parentClass.defaultValue;
		this.intValue = parentClass.getDefaultValue();
	}

	public void setPrivateValue() {
//		this.intValue = parentClass.privateValue;
		intValue = parentClass.getPrivateValue();
	}
	
}

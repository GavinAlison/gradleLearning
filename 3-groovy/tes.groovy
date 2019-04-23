class  groovyBean{
	private String name
}

def bean = new groovyBean()
bean.name='this is a bean'
print bean.name

class Child{
	private String name
}

class Parent {
	Child clild = new Child()
	void configChild(Closure s){
		c.delegate = child
		c.setResolveStrategr Closure.DELEGATE_FIRST
		c()
	}
}

def parent = new Parent()
parent.configChild{
	name = 'child name'
}

println parent.child.name
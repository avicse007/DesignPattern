1. ProtoType pattern is used when you needs lots of same object type 
with few different values. 

2. We use cloneable interface as marker interface to implelemt Prototype
pattern in Java.

3.Also we need to override the clone method as 

@Override
	public Rabbit clone() {
		try {
			return (Rabbit) super.clone();
		}catch(CloneNotSupportedException ex) {
			throw new AssertionError();
		}
	}

4. Also note that clone method is an function of Object Class and not 
of the Cloneable interface. 


5. clone method only creates the shallow copy so the Rabbit class with 
Cloneable interface and overriden clone function will work fine with
immutable fields type or the primitive type.But will work buggy with
fields of Object type like Person as show in step 6 

6. If the Person class does not implements cloneable interface 
and does not override the clone function then the out put will be 

Himalayan 
 Name dhanu
 Age 12
 Breed HIMALAYAN
 Owner Avinash
COPY 
 Name dhanu
 Age 12
 Breed HIMALAYAN
 Owner Avinash
After changing copy
Himalayan 
 Name dhanu
 Age 12
 Breed HIMALAYAN
 Owner Suraj
COPY 
 Name Copy
 Age 10
 Breed AMERICAN
 Owner Suraj

 7. To resolve this issue the person class should also implements Cloneable 
 interface and override clone method.And also have to change rabbit clone
 method
 
 person clone method 
 
 	@Override
	public Person clone() {
		try {
			return (Person) super.clone();
		}catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
 
 
 
 rabbit clone method 
 
 	@Override
	public Rabbit clone() {
		try {
			Rabbit rabbit= (Rabbit) super.clone();
			rabbit.owner=owner.clone();
			return rabbit;
		}catch(CloneNotSupportedException ex) {
			throw new AssertionError();
		}
	}
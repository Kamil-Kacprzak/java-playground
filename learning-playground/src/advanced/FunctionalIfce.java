package advanced;

import java.lang.reflect.Type;

@FunctionalInterface
public interface FunctionalIfce {
	// Functional Interface can contain only one abstract method
	// It can contain other static and default methods
	
	Type getType();
}

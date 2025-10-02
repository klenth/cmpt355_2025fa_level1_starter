package edu.westminsteru.cmpt355.level1.lang;

/**
 * Record representing a local variable (or parameter) in the language
 * <br>
 * N.B.: this is not an IR node and hence should not contain IR nodes:
 * instances of this interface should contain just the needed information to
 * access the relevant variable.
 */
public record LocalVariable(/* add necessary fields here */) implements Variable {
}

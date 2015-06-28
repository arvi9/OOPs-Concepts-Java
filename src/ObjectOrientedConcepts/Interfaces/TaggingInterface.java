/*
 * 
 Tagging interface is the one that doesnot contain
 any methods or attibutes inside it. 
 For example, interface below is a tagging interface.
 Two main design puposes of tagging interface is:
 1. This helps creating a commong parent among a group of interfaces.
 For example, EventListner is a tagging interface that is
 extended by many interfaces like MouseEvent
 
 2. This helps in defining a data type for class.
 Class implementing this interface is not bound by any specific 
 method definitions as this interface itself doesn't contain
 any method declarations. 
 */
package ObjectOrientedConcepts.Interfaces;

public interface TaggingInterface {

}

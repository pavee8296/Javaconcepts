package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// to provide shorthand meta data about the program to the complier 
// Annotations will not  have any direct effect on the code but provide additonal logic to the code 

/*
 *  Inforamtion to the compiler 
 *  Complie time and deployment time processing 
 *  Runtime processing 
 */

// eg; if we are not using a override annotation the java complier has to figure out on its on,
// we are just simplifying for it to save some complier processing time 

// to creae a custom annotation

@Retention(RetentionPolicy.RUNTIME) // when this annotation is going to be active or exectuted while running the prgram or from source 
@Target(ElementType.TYPE) // Where it should be applied which part of the code, to a package,class, method or anywhwere

public @interface MarkerAnnotation {

}


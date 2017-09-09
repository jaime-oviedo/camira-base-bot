/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.camira.retrieval.bot;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author JaimeRodrigo
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface CamiraExtractorBot {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param extractionParameters
  * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
  */
  public void extractVehicles(ExtractionParameters extractionParameters);
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param extractionParameters
  * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
  */
  public void extractNewVehicles(ExtractionParameters extractionParameters);
}
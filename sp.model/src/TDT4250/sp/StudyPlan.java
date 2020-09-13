/**
 */
package TDT4250.sp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.sp.StudyPlan#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link TDT4250.sp.StudyPlan#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link TDT4250.sp.StudyPlan#getCode <em>Code</em>}</li>
 *   <li>{@link TDT4250.sp.StudyPlan#getName <em>Name</em>}</li>
 *   <li>{@link TDT4250.sp.StudyPlan#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see TDT4250.sp.SpPackage#getStudyPlan()
 * @model
 * @generated
 */
public interface StudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' reference list.
	 * The list contents are of type {@link TDT4250.sp.StudyPlan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' reference list.
	 * @see TDT4250.sp.SpPackage#getStudyPlan_Specialization()
	 * @model
	 * @generated
	 */
	EList<StudyPlan> getSpecialization();

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link TDT4250.sp.SemesterInstance}.
	 * It is bidirectional and its opposite is '{@link TDT4250.sp.SemesterInstance#getStudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see TDT4250.sp.SpPackage#getStudyPlan_Semesters()
	 * @see TDT4250.sp.SemesterInstance#getStudyPlan
	 * @model opposite="studyPlan" containment="true"
	 * @generated
	 */
	EList<SemesterInstance> getSemesters();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see TDT4250.sp.SpPackage#getStudyPlan_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link TDT4250.sp.StudyPlan#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TDT4250.sp.SpPackage#getStudyPlan_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TDT4250.sp.StudyPlan#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link TDT4250.sp.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see TDT4250.sp.Level
	 * @see #setLevel(Level)
	 * @see TDT4250.sp.SpPackage#getStudyPlan_Level()
	 * @model
	 * @generated
	 */
	Level getLevel();

	/**
	 * Sets the value of the '{@link TDT4250.sp.StudyPlan#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see TDT4250.sp.Level
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Level value);

} // StudyPlan

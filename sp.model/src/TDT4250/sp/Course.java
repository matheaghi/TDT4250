/**
 */
package TDT4250.sp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.sp.Course#getCode <em>Code</em>}</li>
 *   <li>{@link TDT4250.sp.Course#getName <em>Name</em>}</li>
 *   <li>{@link TDT4250.sp.Course#getSemesterOffered <em>Semester Offered</em>}</li>
 *   <li>{@link TDT4250.sp.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link TDT4250.sp.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link TDT4250.sp.Course#getOfferedTo <em>Offered To</em>}</li>
 *   <li>{@link TDT4250.sp.Course#isAccessToAll <em>Access To All</em>}</li>
 * </ul>
 *
 * @see TDT4250.sp.SpPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see TDT4250.sp.SpPackage#getCourse_Code()
	 * @model dataType="TDT4250.sp.CourseCode"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link TDT4250.sp.Course#getCode <em>Code</em>}' attribute.
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
	 * @see TDT4250.sp.SpPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TDT4250.sp.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semester Offered</b></em>' attribute list.
	 * The list contents are of type {@link TDT4250.sp.Semester}.
	 * The literals are from the enumeration {@link TDT4250.sp.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Offered</em>' attribute list.
	 * @see TDT4250.sp.Semester
	 * @see TDT4250.sp.SpPackage#getCourse_SemesterOffered()
	 * @model upper="2"
	 * @generated
	 */
	EList<Semester> getSemesterOffered();

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(Float)
	 * @see TDT4250.sp.SpPackage#getCourse_Credits()
	 * @model dataType="TDT4250.sp.Credits"
	 * @generated
	 */
	Float getCredits();

	/**
	 * Sets the value of the '{@link TDT4250.sp.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(Float value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link TDT4250.sp.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see TDT4250.sp.Level
	 * @see #setLevel(Level)
	 * @see TDT4250.sp.SpPackage#getCourse_Level()
	 * @model
	 * @generated
	 */
	Level getLevel();

	/**
	 * Sets the value of the '{@link TDT4250.sp.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see TDT4250.sp.Level
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Level value);

	/**
	 * Returns the value of the '<em><b>Offered To</b></em>' reference list.
	 * The list contents are of type {@link TDT4250.sp.StudyPlan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered To</em>' reference list.
	 * @see TDT4250.sp.SpPackage#getCourse_OfferedTo()
	 * @model
	 * @generated
	 */
	EList<StudyPlan> getOfferedTo();

	/**
	 * Returns the value of the '<em><b>Access To All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access To All</em>' attribute.
	 * @see #setAccessToAll(boolean)
	 * @see TDT4250.sp.SpPackage#getCourse_AccessToAll()
	 * @model
	 * @generated
	 */
	boolean isAccessToAll();

	/**
	 * Sets the value of the '{@link TDT4250.sp.Course#isAccessToAll <em>Access To All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access To All</em>' attribute.
	 * @see #isAccessToAll()
	 * @generated
	 */
	void setAccessToAll(boolean value);

} // Course

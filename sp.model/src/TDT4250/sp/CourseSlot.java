/**
 */
package TDT4250.sp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.sp.CourseSlot#getCredits <em>Credits</em>}</li>
 *   <li>{@link TDT4250.sp.CourseSlot#getSemester <em>Semester</em>}</li>
 *   <li>{@link TDT4250.sp.CourseSlot#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see TDT4250.sp.SpPackage#getCourseSlot()
 * @model abstract="true"
 * @generated
 */
public interface CourseSlot extends EObject {
	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(Float)
	 * @see TDT4250.sp.SpPackage#getCourseSlot_Credits()
	 * @model dataType="TDT4250.sp.Credits"
	 * @generated
	 */
	Float getCredits();

	/**
	 * Sets the value of the '{@link TDT4250.sp.CourseSlot#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(Float value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link TDT4250.sp.SemesterInstance#getCourseSlots <em>Course Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' container reference.
	 * @see #setSemester(SemesterInstance)
	 * @see TDT4250.sp.SpPackage#getCourseSlot_Semester()
	 * @see TDT4250.sp.SemesterInstance#getCourseSlots
	 * @model opposite="courseSlots" required="true" transient="false"
	 * @generated
	 */
	SemesterInstance getSemester();

	/**
	 * Sets the value of the '{@link TDT4250.sp.CourseSlot#getSemester <em>Semester</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' container reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(SemesterInstance value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link TDT4250.sp.Status}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see TDT4250.sp.Status
	 * @see #setStatus(Status)
	 * @see TDT4250.sp.SpPackage#getCourseSlot_Status()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link TDT4250.sp.CourseSlot#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see TDT4250.sp.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

} // CourseSlot

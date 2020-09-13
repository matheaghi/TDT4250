/**
 */
package TDT4250.sp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obligatory Course Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.sp.ObligatoryCourseSlot#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see TDT4250.sp.SpPackage#getObligatoryCourseSlot()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CreditsMatchesCourseAndSlot'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 CreditsMatchesCourseAndSlot='self.course.credits = self.credits'"
 * @generated
 */
public interface ObligatoryCourseSlot extends CourseSlot {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see TDT4250.sp.SpPackage#getObligatoryCourseSlot_Course()
	 * @model required="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link TDT4250.sp.ObligatoryCourseSlot#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

} // ObligatoryCourseSlot

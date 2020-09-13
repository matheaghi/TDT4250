/**
 */
package TDT4250.sp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electables Course Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.sp.ElectablesCourseSlot#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see TDT4250.sp.SpPackage#getElectablesCourseSlot()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CreditsMatchesCoursesAndSlots'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 CreditsMatchesCoursesAndSlots='null'"
 * @generated
 */
public interface ElectablesCourseSlot extends CourseSlot {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link TDT4250.sp.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see TDT4250.sp.SpPackage#getElectablesCourseSlot_Courses()
	 * @model lower="2"
	 * @generated
	 */
	EList<Course> getCourses();

} // ElectablesCourseSlot

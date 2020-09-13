/**
 */
package TDT4250.sp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.sp.SemesterInstance#getCourseSlots <em>Course Slots</em>}</li>
 *   <li>{@link TDT4250.sp.SemesterInstance#getSemester <em>Semester</em>}</li>
 *   <li>{@link TDT4250.sp.SemesterInstance#getYear <em>Year</em>}</li>
 *   <li>{@link TDT4250.sp.SemesterInstance#getIntendedWorkload <em>Intended Workload</em>}</li>
 *   <li>{@link TDT4250.sp.SemesterInstance#getStudyPlan <em>Study Plan</em>}</li>
 * </ul>
 *
 * @see TDT4250.sp.SpPackage#getSemesterInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CourseCreditsSumToWorkload AllCoursesMustBeOfferedThatSemester MustHaveAccessToAllCourses MustBeValidLevel'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 CourseCreditsSumToWorkload='(self.courseSlots.credits -&gt; sum()).toString()=(self.intendedWorkload).toString()'"
 * @generated
 */
public interface SemesterInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Course Slots</b></em>' containment reference list.
	 * The list contents are of type {@link TDT4250.sp.CourseSlot}.
	 * It is bidirectional and its opposite is '{@link TDT4250.sp.CourseSlot#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Slots</em>' containment reference list.
	 * @see TDT4250.sp.SpPackage#getSemesterInstance_CourseSlots()
	 * @see TDT4250.sp.CourseSlot#getSemester
	 * @model opposite="semester" containment="true"
	 * @generated
	 */
	EList<CourseSlot> getCourseSlots();

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' attribute.
	 * The literals are from the enumeration {@link TDT4250.sp.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' attribute.
	 * @see TDT4250.sp.Semester
	 * @see #setSemester(Semester)
	 * @see TDT4250.sp.SpPackage#getSemesterInstance_Semester()
	 * @model required="true"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link TDT4250.sp.SemesterInstance#getSemester <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' attribute.
	 * @see TDT4250.sp.Semester
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see TDT4250.sp.SpPackage#getSemesterInstance_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link TDT4250.sp.SemesterInstance#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Intended Workload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intended Workload</em>' attribute.
	 * @see #setIntendedWorkload(Float)
	 * @see TDT4250.sp.SpPackage#getSemesterInstance_IntendedWorkload()
	 * @model dataType="TDT4250.sp.Credits"
	 * @generated
	 */
	Float getIntendedWorkload();

	/**
	 * Sets the value of the '{@link TDT4250.sp.SemesterInstance#getIntendedWorkload <em>Intended Workload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intended Workload</em>' attribute.
	 * @see #getIntendedWorkload()
	 * @generated
	 */
	void setIntendedWorkload(Float value);

	/**
	 * Returns the value of the '<em><b>Study Plan</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link TDT4250.sp.StudyPlan#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Plan</em>' container reference.
	 * @see #setStudyPlan(StudyPlan)
	 * @see TDT4250.sp.SpPackage#getSemesterInstance_StudyPlan()
	 * @see TDT4250.sp.StudyPlan#getSemesters
	 * @model opposite="semesters" required="true" transient="false"
	 * @generated
	 */
	StudyPlan getStudyPlan();

	/**
	 * Sets the value of the '{@link TDT4250.sp.SemesterInstance#getStudyPlan <em>Study Plan</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Plan</em>' container reference.
	 * @see #getStudyPlan()
	 * @generated
	 */
	void setStudyPlan(StudyPlan value);

} // SemesterInstance

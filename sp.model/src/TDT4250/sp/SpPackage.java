/**
 */
package TDT4250.sp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see TDT4250.sp.SpFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface SpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/TDT4250.sp.model/model/sp.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpPackage eINSTANCE = TDT4250.sp.impl.SpPackageImpl.init();

	/**
	 * The meta object id for the '{@link TDT4250.sp.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.sp.impl.OrganizationImpl
	 * @see TDT4250.sp.impl.SpPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 0;

	/**
	 * The feature id for the '<em><b>Departments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DEPARTMENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.sp.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.sp.impl.DepartmentImpl
	 * @see TDT4250.sp.impl.SpPackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 1;

	/**
	 * The feature id for the '<em><b>Programmes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__PROGRAMMES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__ABBREVIATION = 2;

	/**
	 * The feature id for the '<em><b>Responsible For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__RESPONSIBLE_FOR = 3;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.sp.impl.StudyPlanImpl <em>Study Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.sp.impl.StudyPlanImpl
	 * @see TDT4250.sp.impl.SpPackageImpl#getStudyPlan()
	 * @generated
	 */
	int STUDY_PLAN = 2;

	/**
	 * The feature id for the '<em><b>Specialization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__SPECIALIZATION = 0;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__SEMESTERS = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__CODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__NAME = 3;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__LEVEL = 4;

	/**
	 * The number of structural features of the '<em>Study Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Study Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.sp.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.sp.impl.CourseImpl
	 * @see TDT4250.sp.impl.SpPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Semester Offered</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__SEMESTER_OFFERED = 2;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 3;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Offered To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__OFFERED_TO = 5;

	/**
	 * The feature id for the '<em><b>Access To All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__ACCESS_TO_ALL = 6;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.sp.impl.SemesterInstanceImpl <em>Semester Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.sp.impl.SemesterInstanceImpl
	 * @see TDT4250.sp.impl.SpPackageImpl#getSemesterInstance()
	 * @generated
	 */
	int SEMESTER_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Course Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_INSTANCE__COURSE_SLOTS = 0;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_INSTANCE__SEMESTER = 1;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_INSTANCE__YEAR = 2;

	/**
	 * The feature id for the '<em><b>Intended Workload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_INSTANCE__INTENDED_WORKLOAD = 3;

	/**
	 * The feature id for the '<em><b>Study Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_INSTANCE__STUDY_PLAN = 4;

	/**
	 * The number of structural features of the '<em>Semester Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_INSTANCE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Semester Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.sp.impl.CourseSlotImpl <em>Course Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.sp.impl.CourseSlotImpl
	 * @see TDT4250.sp.impl.SpPackageImpl#getCourseSlot()
	 * @generated
	 */
	int COURSE_SLOT = 5;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SLOT__CREDITS = 0;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SLOT__SEMESTER = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SLOT__STATUS = 2;

	/**
	 * The number of structural features of the '<em>Course Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SLOT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Course Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SLOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.sp.impl.ElectablesCourseSlotImpl <em>Electables Course Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.sp.impl.ElectablesCourseSlotImpl
	 * @see TDT4250.sp.impl.SpPackageImpl#getElectablesCourseSlot()
	 * @generated
	 */
	int ELECTABLES_COURSE_SLOT = 6;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTABLES_COURSE_SLOT__CREDITS = COURSE_SLOT__CREDITS;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTABLES_COURSE_SLOT__SEMESTER = COURSE_SLOT__SEMESTER;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTABLES_COURSE_SLOT__STATUS = COURSE_SLOT__STATUS;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTABLES_COURSE_SLOT__COURSES = COURSE_SLOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Electables Course Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTABLES_COURSE_SLOT_FEATURE_COUNT = COURSE_SLOT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Electables Course Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTABLES_COURSE_SLOT_OPERATION_COUNT = COURSE_SLOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TDT4250.sp.impl.ObligatoryCourseSlotImpl <em>Obligatory Course Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.sp.impl.ObligatoryCourseSlotImpl
	 * @see TDT4250.sp.impl.SpPackageImpl#getObligatoryCourseSlot()
	 * @generated
	 */
	int OBLIGATORY_COURSE_SLOT = 7;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATORY_COURSE_SLOT__CREDITS = COURSE_SLOT__CREDITS;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATORY_COURSE_SLOT__SEMESTER = COURSE_SLOT__SEMESTER;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATORY_COURSE_SLOT__STATUS = COURSE_SLOT__STATUS;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATORY_COURSE_SLOT__COURSE = COURSE_SLOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Obligatory Course Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATORY_COURSE_SLOT_FEATURE_COUNT = COURSE_SLOT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Obligatory Course Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATORY_COURSE_SLOT_OPERATION_COUNT = COURSE_SLOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TDT4250.sp.Semester <em>Semester</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.sp.Semester
	 * @see TDT4250.sp.impl.SpPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 8;

	/**
	 * The meta object id for the '{@link TDT4250.sp.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.sp.Status
	 * @see TDT4250.sp.impl.SpPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 9;

	/**
	 * The meta object id for the '{@link TDT4250.sp.Level <em>Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.sp.Level
	 * @see TDT4250.sp.impl.SpPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 10;

	/**
	 * The meta object id for the '<em>Credits</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see TDT4250.sp.impl.SpPackageImpl#getCredits()
	 * @generated
	 */
	int CREDITS = 11;

	/**
	 * The meta object id for the '<em>Course Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see TDT4250.sp.impl.SpPackageImpl#getCourseCode()
	 * @generated
	 */
	int COURSE_CODE = 12;


	/**
	 * Returns the meta object for class '{@link TDT4250.sp.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see TDT4250.sp.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the containment reference list '{@link TDT4250.sp.Organization#getDepartments <em>Departments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Departments</em>'.
	 * @see TDT4250.sp.Organization#getDepartments()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Departments();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.sp.Organization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TDT4250.sp.Organization#getName()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Name();

	/**
	 * Returns the meta object for class '{@link TDT4250.sp.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see TDT4250.sp.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the containment reference list '{@link TDT4250.sp.Department#getProgrammes <em>Programmes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programmes</em>'.
	 * @see TDT4250.sp.Department#getProgrammes()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Programmes();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.sp.Department#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TDT4250.sp.Department#getName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Name();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.sp.Department#getAbbreviation <em>Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbreviation</em>'.
	 * @see TDT4250.sp.Department#getAbbreviation()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Abbreviation();

	/**
	 * Returns the meta object for the containment reference list '{@link TDT4250.sp.Department#getResponsibleFor <em>Responsible For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible For</em>'.
	 * @see TDT4250.sp.Department#getResponsibleFor()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_ResponsibleFor();

	/**
	 * Returns the meta object for class '{@link TDT4250.sp.StudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Plan</em>'.
	 * @see TDT4250.sp.StudyPlan
	 * @generated
	 */
	EClass getStudyPlan();

	/**
	 * Returns the meta object for the reference list '{@link TDT4250.sp.StudyPlan#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specialization</em>'.
	 * @see TDT4250.sp.StudyPlan#getSpecialization()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_Specialization();

	/**
	 * Returns the meta object for the containment reference list '{@link TDT4250.sp.StudyPlan#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see TDT4250.sp.StudyPlan#getSemesters()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_Semesters();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.sp.StudyPlan#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see TDT4250.sp.StudyPlan#getCode()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EAttribute getStudyPlan_Code();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.sp.StudyPlan#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TDT4250.sp.StudyPlan#getName()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EAttribute getStudyPlan_Name();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.sp.StudyPlan#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see TDT4250.sp.StudyPlan#getLevel()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EAttribute getStudyPlan_Level();

	/**
	 * Returns the meta object for class '{@link TDT4250.sp.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see TDT4250.sp.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.sp.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see TDT4250.sp.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.sp.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TDT4250.sp.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute list '{@link TDT4250.sp.Course#getSemesterOffered <em>Semester Offered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Semester Offered</em>'.
	 * @see TDT4250.sp.Course#getSemesterOffered()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_SemesterOffered();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.sp.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see TDT4250.sp.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.sp.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see TDT4250.sp.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for the reference list '{@link TDT4250.sp.Course#getOfferedTo <em>Offered To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offered To</em>'.
	 * @see TDT4250.sp.Course#getOfferedTo()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_OfferedTo();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.sp.Course#isAccessToAll <em>Access To All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access To All</em>'.
	 * @see TDT4250.sp.Course#isAccessToAll()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_AccessToAll();

	/**
	 * Returns the meta object for class '{@link TDT4250.sp.SemesterInstance <em>Semester Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester Instance</em>'.
	 * @see TDT4250.sp.SemesterInstance
	 * @generated
	 */
	EClass getSemesterInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link TDT4250.sp.SemesterInstance#getCourseSlots <em>Course Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course Slots</em>'.
	 * @see TDT4250.sp.SemesterInstance#getCourseSlots()
	 * @see #getSemesterInstance()
	 * @generated
	 */
	EReference getSemesterInstance_CourseSlots();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.sp.SemesterInstance#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester</em>'.
	 * @see TDT4250.sp.SemesterInstance#getSemester()
	 * @see #getSemesterInstance()
	 * @generated
	 */
	EAttribute getSemesterInstance_Semester();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.sp.SemesterInstance#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see TDT4250.sp.SemesterInstance#getYear()
	 * @see #getSemesterInstance()
	 * @generated
	 */
	EAttribute getSemesterInstance_Year();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.sp.SemesterInstance#getIntendedWorkload <em>Intended Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intended Workload</em>'.
	 * @see TDT4250.sp.SemesterInstance#getIntendedWorkload()
	 * @see #getSemesterInstance()
	 * @generated
	 */
	EAttribute getSemesterInstance_IntendedWorkload();

	/**
	 * Returns the meta object for the container reference '{@link TDT4250.sp.SemesterInstance#getStudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Study Plan</em>'.
	 * @see TDT4250.sp.SemesterInstance#getStudyPlan()
	 * @see #getSemesterInstance()
	 * @generated
	 */
	EReference getSemesterInstance_StudyPlan();

	/**
	 * Returns the meta object for class '{@link TDT4250.sp.CourseSlot <em>Course Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Slot</em>'.
	 * @see TDT4250.sp.CourseSlot
	 * @generated
	 */
	EClass getCourseSlot();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.sp.CourseSlot#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see TDT4250.sp.CourseSlot#getCredits()
	 * @see #getCourseSlot()
	 * @generated
	 */
	EAttribute getCourseSlot_Credits();

	/**
	 * Returns the meta object for the container reference '{@link TDT4250.sp.CourseSlot#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Semester</em>'.
	 * @see TDT4250.sp.CourseSlot#getSemester()
	 * @see #getCourseSlot()
	 * @generated
	 */
	EReference getCourseSlot_Semester();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.sp.CourseSlot#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see TDT4250.sp.CourseSlot#getStatus()
	 * @see #getCourseSlot()
	 * @generated
	 */
	EAttribute getCourseSlot_Status();

	/**
	 * Returns the meta object for class '{@link TDT4250.sp.ElectablesCourseSlot <em>Electables Course Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electables Course Slot</em>'.
	 * @see TDT4250.sp.ElectablesCourseSlot
	 * @generated
	 */
	EClass getElectablesCourseSlot();

	/**
	 * Returns the meta object for the reference list '{@link TDT4250.sp.ElectablesCourseSlot#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Courses</em>'.
	 * @see TDT4250.sp.ElectablesCourseSlot#getCourses()
	 * @see #getElectablesCourseSlot()
	 * @generated
	 */
	EReference getElectablesCourseSlot_Courses();

	/**
	 * Returns the meta object for class '{@link TDT4250.sp.ObligatoryCourseSlot <em>Obligatory Course Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obligatory Course Slot</em>'.
	 * @see TDT4250.sp.ObligatoryCourseSlot
	 * @generated
	 */
	EClass getObligatoryCourseSlot();

	/**
	 * Returns the meta object for the reference '{@link TDT4250.sp.ObligatoryCourseSlot#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course</em>'.
	 * @see TDT4250.sp.ObligatoryCourseSlot#getCourse()
	 * @see #getObligatoryCourseSlot()
	 * @generated
	 */
	EReference getObligatoryCourseSlot_Course();

	/**
	 * Returns the meta object for enum '{@link TDT4250.sp.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Semester</em>'.
	 * @see TDT4250.sp.Semester
	 * @generated
	 */
	EEnum getSemester();

	/**
	 * Returns the meta object for enum '{@link TDT4250.sp.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see TDT4250.sp.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for enum '{@link TDT4250.sp.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Level</em>'.
	 * @see TDT4250.sp.Level
	 * @generated
	 */
	EEnum getLevel();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Credits</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 * @generated
	 */
	EDataType getCredits();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Course Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Course Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getCourseCode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpFactory getSpFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link TDT4250.sp.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.sp.impl.OrganizationImpl
		 * @see TDT4250.sp.impl.SpPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '<em><b>Departments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__DEPARTMENTS = eINSTANCE.getOrganization_Departments();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__NAME = eINSTANCE.getOrganization_Name();

		/**
		 * The meta object literal for the '{@link TDT4250.sp.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.sp.impl.DepartmentImpl
		 * @see TDT4250.sp.impl.SpPackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Programmes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__PROGRAMMES = eINSTANCE.getDepartment_Programmes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__NAME = eINSTANCE.getDepartment_Name();

		/**
		 * The meta object literal for the '<em><b>Abbreviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__ABBREVIATION = eINSTANCE.getDepartment_Abbreviation();

		/**
		 * The meta object literal for the '<em><b>Responsible For</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__RESPONSIBLE_FOR = eINSTANCE.getDepartment_ResponsibleFor();

		/**
		 * The meta object literal for the '{@link TDT4250.sp.impl.StudyPlanImpl <em>Study Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.sp.impl.StudyPlanImpl
		 * @see TDT4250.sp.impl.SpPackageImpl#getStudyPlan()
		 * @generated
		 */
		EClass STUDY_PLAN = eINSTANCE.getStudyPlan();

		/**
		 * The meta object literal for the '<em><b>Specialization</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__SPECIALIZATION = eINSTANCE.getStudyPlan_Specialization();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__SEMESTERS = eINSTANCE.getStudyPlan_Semesters();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_PLAN__CODE = eINSTANCE.getStudyPlan_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_PLAN__NAME = eINSTANCE.getStudyPlan_Name();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_PLAN__LEVEL = eINSTANCE.getStudyPlan_Level();

		/**
		 * The meta object literal for the '{@link TDT4250.sp.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.sp.impl.CourseImpl
		 * @see TDT4250.sp.impl.SpPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Semester Offered</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__SEMESTER_OFFERED = eINSTANCE.getCourse_SemesterOffered();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '<em><b>Offered To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__OFFERED_TO = eINSTANCE.getCourse_OfferedTo();

		/**
		 * The meta object literal for the '<em><b>Access To All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__ACCESS_TO_ALL = eINSTANCE.getCourse_AccessToAll();

		/**
		 * The meta object literal for the '{@link TDT4250.sp.impl.SemesterInstanceImpl <em>Semester Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.sp.impl.SemesterInstanceImpl
		 * @see TDT4250.sp.impl.SpPackageImpl#getSemesterInstance()
		 * @generated
		 */
		EClass SEMESTER_INSTANCE = eINSTANCE.getSemesterInstance();

		/**
		 * The meta object literal for the '<em><b>Course Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER_INSTANCE__COURSE_SLOTS = eINSTANCE.getSemesterInstance_CourseSlots();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER_INSTANCE__SEMESTER = eINSTANCE.getSemesterInstance_Semester();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER_INSTANCE__YEAR = eINSTANCE.getSemesterInstance_Year();

		/**
		 * The meta object literal for the '<em><b>Intended Workload</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER_INSTANCE__INTENDED_WORKLOAD = eINSTANCE.getSemesterInstance_IntendedWorkload();

		/**
		 * The meta object literal for the '<em><b>Study Plan</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER_INSTANCE__STUDY_PLAN = eINSTANCE.getSemesterInstance_StudyPlan();

		/**
		 * The meta object literal for the '{@link TDT4250.sp.impl.CourseSlotImpl <em>Course Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.sp.impl.CourseSlotImpl
		 * @see TDT4250.sp.impl.SpPackageImpl#getCourseSlot()
		 * @generated
		 */
		EClass COURSE_SLOT = eINSTANCE.getCourseSlot();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_SLOT__CREDITS = eINSTANCE.getCourseSlot_Credits();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_SLOT__SEMESTER = eINSTANCE.getCourseSlot_Semester();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_SLOT__STATUS = eINSTANCE.getCourseSlot_Status();

		/**
		 * The meta object literal for the '{@link TDT4250.sp.impl.ElectablesCourseSlotImpl <em>Electables Course Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.sp.impl.ElectablesCourseSlotImpl
		 * @see TDT4250.sp.impl.SpPackageImpl#getElectablesCourseSlot()
		 * @generated
		 */
		EClass ELECTABLES_COURSE_SLOT = eINSTANCE.getElectablesCourseSlot();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTABLES_COURSE_SLOT__COURSES = eINSTANCE.getElectablesCourseSlot_Courses();

		/**
		 * The meta object literal for the '{@link TDT4250.sp.impl.ObligatoryCourseSlotImpl <em>Obligatory Course Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.sp.impl.ObligatoryCourseSlotImpl
		 * @see TDT4250.sp.impl.SpPackageImpl#getObligatoryCourseSlot()
		 * @generated
		 */
		EClass OBLIGATORY_COURSE_SLOT = eINSTANCE.getObligatoryCourseSlot();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBLIGATORY_COURSE_SLOT__COURSE = eINSTANCE.getObligatoryCourseSlot_Course();

		/**
		 * The meta object literal for the '{@link TDT4250.sp.Semester <em>Semester</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.sp.Semester
		 * @see TDT4250.sp.impl.SpPackageImpl#getSemester()
		 * @generated
		 */
		EEnum SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '{@link TDT4250.sp.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.sp.Status
		 * @see TDT4250.sp.impl.SpPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link TDT4250.sp.Level <em>Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.sp.Level
		 * @see TDT4250.sp.impl.SpPackageImpl#getLevel()
		 * @generated
		 */
		EEnum LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '<em>Credits</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see TDT4250.sp.impl.SpPackageImpl#getCredits()
		 * @generated
		 */
		EDataType CREDITS = eINSTANCE.getCredits();

		/**
		 * The meta object literal for the '<em>Course Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see TDT4250.sp.impl.SpPackageImpl#getCourseCode()
		 * @generated
		 */
		EDataType COURSE_CODE = eINSTANCE.getCourseCode();

	}

} //SpPackage

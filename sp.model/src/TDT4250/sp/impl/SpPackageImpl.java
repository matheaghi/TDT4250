/**
 */
package TDT4250.sp.impl;

import TDT4250.sp.Course;
import TDT4250.sp.CourseSlot;
import TDT4250.sp.Department;
import TDT4250.sp.ElectablesCourseSlot;
import TDT4250.sp.Level;
import TDT4250.sp.ObligatoryCourseSlot;
import TDT4250.sp.Organization;
import TDT4250.sp.Semester;
import TDT4250.sp.SemesterInstance;
import TDT4250.sp.SpFactory;
import TDT4250.sp.SpPackage;
import TDT4250.sp.Status;
import TDT4250.sp.StudyPlan;

import TDT4250.sp.util.SpValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpPackageImpl extends EPackageImpl implements SpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studyPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semesterInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electablesCourseSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obligatoryCourseSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum semesterEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum levelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType creditsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType courseCodeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see TDT4250.sp.SpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpPackageImpl() {
		super(eNS_URI, SpFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpPackage init() {
		if (isInited) return (SpPackage)EPackage.Registry.INSTANCE.getEPackage(SpPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSpPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SpPackageImpl theSpPackage = registeredSpPackage instanceof SpPackageImpl ? (SpPackageImpl)registeredSpPackage : new SpPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSpPackage.createPackageContents();

		// Initialize created meta-data
		theSpPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSpPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SpValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSpPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpPackage.eNS_URI, theSpPackage);
		return theSpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganization() {
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Departments() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganization_Name() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepartment() {
		return departmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartment_Programmes() {
		return (EReference)departmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartment_Name() {
		return (EAttribute)departmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartment_Abbreviation() {
		return (EAttribute)departmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartment_ResponsibleFor() {
		return (EReference)departmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudyPlan() {
		return studyPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyPlan_Specialization() {
		return (EReference)studyPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyPlan_Semesters() {
		return (EReference)studyPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyPlan_Code() {
		return (EAttribute)studyPlanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyPlan_Name() {
		return (EAttribute)studyPlanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyPlan_Level() {
		return (EAttribute)studyPlanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourse() {
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Code() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Name() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_SemesterOffered() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Credits() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Level() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_OfferedTo() {
		return (EReference)courseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_AccessToAll() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemesterInstance() {
		return semesterInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemesterInstance_CourseSlots() {
		return (EReference)semesterInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemesterInstance_Semester() {
		return (EAttribute)semesterInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemesterInstance_Year() {
		return (EAttribute)semesterInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemesterInstance_IntendedWorkload() {
		return (EAttribute)semesterInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemesterInstance_StudyPlan() {
		return (EReference)semesterInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourseSlot() {
		return courseSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseSlot_Credits() {
		return (EAttribute)courseSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseSlot_Semester() {
		return (EReference)courseSlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseSlot_Status() {
		return (EAttribute)courseSlotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectablesCourseSlot() {
		return electablesCourseSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElectablesCourseSlot_Courses() {
		return (EReference)electablesCourseSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObligatoryCourseSlot() {
		return obligatoryCourseSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObligatoryCourseSlot_Course() {
		return (EReference)obligatoryCourseSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSemester() {
		return semesterEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatus() {
		return statusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLevel() {
		return levelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCredits() {
		return creditsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCourseCode() {
		return courseCodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpFactory getSpFactory() {
		return (SpFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		organizationEClass = createEClass(ORGANIZATION);
		createEReference(organizationEClass, ORGANIZATION__DEPARTMENTS);
		createEAttribute(organizationEClass, ORGANIZATION__NAME);

		departmentEClass = createEClass(DEPARTMENT);
		createEReference(departmentEClass, DEPARTMENT__PROGRAMMES);
		createEAttribute(departmentEClass, DEPARTMENT__NAME);
		createEAttribute(departmentEClass, DEPARTMENT__ABBREVIATION);
		createEReference(departmentEClass, DEPARTMENT__RESPONSIBLE_FOR);

		studyPlanEClass = createEClass(STUDY_PLAN);
		createEReference(studyPlanEClass, STUDY_PLAN__SPECIALIZATION);
		createEReference(studyPlanEClass, STUDY_PLAN__SEMESTERS);
		createEAttribute(studyPlanEClass, STUDY_PLAN__CODE);
		createEAttribute(studyPlanEClass, STUDY_PLAN__NAME);
		createEAttribute(studyPlanEClass, STUDY_PLAN__LEVEL);

		courseEClass = createEClass(COURSE);
		createEAttribute(courseEClass, COURSE__CODE);
		createEAttribute(courseEClass, COURSE__NAME);
		createEAttribute(courseEClass, COURSE__SEMESTER_OFFERED);
		createEAttribute(courseEClass, COURSE__CREDITS);
		createEAttribute(courseEClass, COURSE__LEVEL);
		createEReference(courseEClass, COURSE__OFFERED_TO);
		createEAttribute(courseEClass, COURSE__ACCESS_TO_ALL);

		semesterInstanceEClass = createEClass(SEMESTER_INSTANCE);
		createEReference(semesterInstanceEClass, SEMESTER_INSTANCE__COURSE_SLOTS);
		createEAttribute(semesterInstanceEClass, SEMESTER_INSTANCE__SEMESTER);
		createEAttribute(semesterInstanceEClass, SEMESTER_INSTANCE__YEAR);
		createEAttribute(semesterInstanceEClass, SEMESTER_INSTANCE__INTENDED_WORKLOAD);
		createEReference(semesterInstanceEClass, SEMESTER_INSTANCE__STUDY_PLAN);

		courseSlotEClass = createEClass(COURSE_SLOT);
		createEAttribute(courseSlotEClass, COURSE_SLOT__CREDITS);
		createEReference(courseSlotEClass, COURSE_SLOT__SEMESTER);
		createEAttribute(courseSlotEClass, COURSE_SLOT__STATUS);

		electablesCourseSlotEClass = createEClass(ELECTABLES_COURSE_SLOT);
		createEReference(electablesCourseSlotEClass, ELECTABLES_COURSE_SLOT__COURSES);

		obligatoryCourseSlotEClass = createEClass(OBLIGATORY_COURSE_SLOT);
		createEReference(obligatoryCourseSlotEClass, OBLIGATORY_COURSE_SLOT__COURSE);

		// Create enums
		semesterEEnum = createEEnum(SEMESTER);
		statusEEnum = createEEnum(STATUS);
		levelEEnum = createEEnum(LEVEL);

		// Create data types
		creditsEDataType = createEDataType(CREDITS);
		courseCodeEDataType = createEDataType(COURSE_CODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		electablesCourseSlotEClass.getESuperTypes().add(this.getCourseSlot());
		obligatoryCourseSlotEClass.getESuperTypes().add(this.getCourseSlot());

		// Initialize classes, features, and operations; add parameters
		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganization_Departments(), this.getDepartment(), null, "departments", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganization_Name(), ecorePackage.getEString(), "name", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(departmentEClass, Department.class, "Department", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDepartment_Programmes(), this.getStudyPlan(), null, "programmes", null, 0, -1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartment_Abbreviation(), ecorePackage.getEString(), "abbreviation", null, 0, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartment_ResponsibleFor(), this.getCourse(), null, "responsibleFor", null, 0, -1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studyPlanEClass, StudyPlan.class, "StudyPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStudyPlan_Specialization(), this.getStudyPlan(), null, "specialization", null, 0, -1, StudyPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyPlan_Semesters(), this.getSemesterInstance(), this.getSemesterInstance_StudyPlan(), "semesters", null, 0, -1, StudyPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyPlan_Code(), ecorePackage.getEString(), "code", null, 0, 1, StudyPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyPlan_Name(), ecorePackage.getEString(), "name", null, 0, 1, StudyPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyPlan_Level(), this.getLevel(), "level", null, 0, 1, StudyPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourse_Code(), this.getCourseCode(), "code", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Name(), ecorePackage.getEString(), "name", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_SemesterOffered(), this.getSemester(), "semesterOffered", null, 0, 2, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Credits(), this.getCredits(), "credits", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Level(), this.getLevel(), "level", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_OfferedTo(), this.getStudyPlan(), null, "offeredTo", null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_AccessToAll(), ecorePackage.getEBoolean(), "accessToAll", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semesterInstanceEClass, SemesterInstance.class, "SemesterInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemesterInstance_CourseSlots(), this.getCourseSlot(), this.getCourseSlot_Semester(), "courseSlots", null, 0, -1, SemesterInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemesterInstance_Semester(), this.getSemester(), "semester", null, 1, 1, SemesterInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemesterInstance_Year(), ecorePackage.getEInt(), "year", null, 0, 1, SemesterInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemesterInstance_IntendedWorkload(), this.getCredits(), "intendedWorkload", null, 0, 1, SemesterInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemesterInstance_StudyPlan(), this.getStudyPlan(), this.getStudyPlan_Semesters(), "studyPlan", null, 1, 1, SemesterInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseSlotEClass, CourseSlot.class, "CourseSlot", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourseSlot_Credits(), this.getCredits(), "credits", null, 0, 1, CourseSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseSlot_Semester(), this.getSemesterInstance(), this.getSemesterInstance_CourseSlots(), "semester", null, 1, 1, CourseSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseSlot_Status(), this.getStatus(), "status", null, 0, 1, CourseSlot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(electablesCourseSlotEClass, ElectablesCourseSlot.class, "ElectablesCourseSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElectablesCourseSlot_Courses(), this.getCourse(), null, "courses", null, 2, -1, ElectablesCourseSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(obligatoryCourseSlotEClass, ObligatoryCourseSlot.class, "ObligatoryCourseSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObligatoryCourseSlot_Course(), this.getCourse(), null, "course", null, 1, 1, ObligatoryCourseSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(semesterEEnum, Semester.class, "Semester");
		addEEnumLiteral(semesterEEnum, Semester.AUTUMN);
		addEEnumLiteral(semesterEEnum, Semester.SPRING);

		initEEnum(statusEEnum, Status.class, "Status");
		addEEnumLiteral(statusEEnum, Status.OBLIGATORY);
		addEEnumLiteral(statusEEnum, Status.ELECTABLE);

		initEEnum(levelEEnum, Level.class, "Level");
		addEEnumLiteral(levelEEnum, Level.BACHELOR);
		addEEnumLiteral(levelEEnum, Level.MASTERS);

		// Initialize data types
		initEDataType(creditsEDataType, Float.class, "Credits", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(courseCodeEDataType, String.class, "CourseCode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/acceleo/query/1.0
		create_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "validationDelegates", "http://www.eclipse.org/acceleo/query/1.0"
		   });
		addAnnotation
		  (electablesCourseSlotEClass,
		   source,
		   new String[] {
			   "constraints", "CreditsMatchesCoursesAndSlots"
		   });
		addAnnotation
		  (obligatoryCourseSlotEClass,
		   source,
		   new String[] {
			   "constraints", "CreditsMatchesCourseAndSlot"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/acceleo/query/1.0</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create_1Annotations() {
		String source = "http://www.eclipse.org/acceleo/query/1.0";
		addAnnotation
		  (electablesCourseSlotEClass,
		   source,
		   new String[] {
			   "CreditsMatchesCoursesAndSlots", null
		   });
		addAnnotation
		  (obligatoryCourseSlotEClass,
		   source,
		   new String[] {
			   "CreditsMatchesCourseAndSlot", "self.course.credits = self.credits"
		   });
	}

} //SpPackageImpl

/**
 */
package TDT4250.sp.impl;

import TDT4250.sp.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpFactoryImpl extends EFactoryImpl implements SpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpFactory init() {
		try {
			SpFactory theSpFactory = (SpFactory)EPackage.Registry.INSTANCE.getEFactory(SpPackage.eNS_URI);
			if (theSpFactory != null) {
				return theSpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SpPackage.ORGANIZATION: return createOrganization();
			case SpPackage.DEPARTMENT: return createDepartment();
			case SpPackage.STUDY_PLAN: return createStudyPlan();
			case SpPackage.COURSE: return createCourse();
			case SpPackage.SEMESTER_INSTANCE: return createSemesterInstance();
			case SpPackage.ELECTABLES_COURSE_SLOT: return createElectablesCourseSlot();
			case SpPackage.OBLIGATORY_COURSE_SLOT: return createObligatoryCourseSlot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SpPackage.SEMESTER:
				return createSemesterFromString(eDataType, initialValue);
			case SpPackage.STATUS:
				return createStatusFromString(eDataType, initialValue);
			case SpPackage.LEVEL:
				return createLevelFromString(eDataType, initialValue);
			case SpPackage.CREDITS:
				return createCreditsFromString(eDataType, initialValue);
			case SpPackage.COURSE_CODE:
				return createCourseCodeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SpPackage.SEMESTER:
				return convertSemesterToString(eDataType, instanceValue);
			case SpPackage.STATUS:
				return convertStatusToString(eDataType, instanceValue);
			case SpPackage.LEVEL:
				return convertLevelToString(eDataType, instanceValue);
			case SpPackage.CREDITS:
				return convertCreditsToString(eDataType, instanceValue);
			case SpPackage.COURSE_CODE:
				return convertCourseCodeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department createDepartment() {
		DepartmentImpl department = new DepartmentImpl();
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyPlan createStudyPlan() {
		StudyPlanImpl studyPlan = new StudyPlanImpl();
		return studyPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemesterInstance createSemesterInstance() {
		SemesterInstanceImpl semesterInstance = new SemesterInstanceImpl();
		return semesterInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectablesCourseSlot createElectablesCourseSlot() {
		ElectablesCourseSlotImpl electablesCourseSlot = new ElectablesCourseSlotImpl();
		return electablesCourseSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObligatoryCourseSlot createObligatoryCourseSlot() {
		ObligatoryCourseSlotImpl obligatoryCourseSlot = new ObligatoryCourseSlotImpl();
		return obligatoryCourseSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester createSemesterFromString(EDataType eDataType, String initialValue) {
		Semester result = Semester.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSemesterToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatusFromString(EDataType eDataType, String initialValue) {
		Status result = Status.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level createLevelFromString(EDataType eDataType, String initialValue) {
		Level result = Level.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createCreditsFromString(EDataType eDataType, String initialValue) {
		return (Float)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCreditsToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCourseCodeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCourseCodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpPackage getSpPackage() {
		return (SpPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpPackage getPackage() {
		return SpPackage.eINSTANCE;
	}

} //SpFactoryImpl

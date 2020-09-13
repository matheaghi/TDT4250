/**
 */
package TDT4250.sp.util;

import TDT4250.sp.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see TDT4250.sp.SpPackage
 * @generated
 */
public class SpValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SpValidator INSTANCE = new SpValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "TDT4250.sp";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SpPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SpPackage.ORGANIZATION:
				return validateOrganization((Organization)value, diagnostics, context);
			case SpPackage.DEPARTMENT:
				return validateDepartment((Department)value, diagnostics, context);
			case SpPackage.STUDY_PLAN:
				return validateStudyPlan((StudyPlan)value, diagnostics, context);
			case SpPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case SpPackage.SEMESTER_INSTANCE:
				return validateSemesterInstance((SemesterInstance)value, diagnostics, context);
			case SpPackage.COURSE_SLOT:
				return validateCourseSlot((CourseSlot)value, diagnostics, context);
			case SpPackage.ELECTABLES_COURSE_SLOT:
				return validateElectablesCourseSlot((ElectablesCourseSlot)value, diagnostics, context);
			case SpPackage.OBLIGATORY_COURSE_SLOT:
				return validateObligatoryCourseSlot((ObligatoryCourseSlot)value, diagnostics, context);
			case SpPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case SpPackage.STATUS:
				return validateStatus((Status)value, diagnostics, context);
			case SpPackage.LEVEL:
				return validateLevel((Level)value, diagnostics, context);
			case SpPackage.CREDITS:
				return validateCredits((Float)value, diagnostics, context);
			case SpPackage.COURSE_CODE:
				return validateCourseCode((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganization(Organization organization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyPlan(StudyPlan studyPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studyPlan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterInstance(SemesterInstance semesterInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semesterInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseSlot(CourseSlot courseSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseSlot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElectablesCourseSlot(ElectablesCourseSlot electablesCourseSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(electablesCourseSlot, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(electablesCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(electablesCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(electablesCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(electablesCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(electablesCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(electablesCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(electablesCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(electablesCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateElectablesCourseSlot_CreditsMatchesCoursesAndSlots(electablesCourseSlot, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CreditsMatchesCoursesAndSlots constraint of '<em>Electables Course Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElectablesCourseSlot_CreditsMatchesCoursesAndSlots(ElectablesCourseSlot electablesCourseSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "CreditsMatchesCoursesAndSlots", getObjectLabel(electablesCourseSlot, context) },
						 new Object[] { electablesCourseSlot },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObligatoryCourseSlot(ObligatoryCourseSlot obligatoryCourseSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(obligatoryCourseSlot, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(obligatoryCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obligatoryCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obligatoryCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obligatoryCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(obligatoryCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(obligatoryCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(obligatoryCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obligatoryCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObligatoryCourseSlot_CreditsMatchesCourseAndSlot(obligatoryCourseSlot, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CreditsMatchesCourseAndSlot constraint of '<em>Obligatory Course Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBLIGATORY_COURSE_SLOT__CREDITS_MATCHES_COURSE_AND_SLOT__EEXPRESSION = "self.course.credits = self.credits";

	/**
	 * Validates the CreditsMatchesCourseAndSlot constraint of '<em>Obligatory Course Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObligatoryCourseSlot_CreditsMatchesCourseAndSlot(ObligatoryCourseSlot obligatoryCourseSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SpPackage.Literals.OBLIGATORY_COURSE_SLOT,
				 obligatoryCourseSlot,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "CreditsMatchesCourseAndSlot",
				 OBLIGATORY_COURSE_SLOT__CREDITS_MATCHES_COURSE_AND_SLOT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatus(Status status, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevel(Level level, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCredits(Float credits, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCode(String courseCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SpValidator

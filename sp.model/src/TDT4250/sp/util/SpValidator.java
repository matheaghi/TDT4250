/**
 */
package TDT4250.sp.util;

import TDT4250.sp.*;

import java.util.ArrayList;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
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
		if (!validate_NoCircularContainment(semesterInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semesterInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semesterInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semesterInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semesterInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semesterInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semesterInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semesterInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semesterInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemesterInstance_CourseCreditsSumToWorkload(semesterInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemesterInstance_AllCoursesMustBeOfferedThatSemester(semesterInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemesterInstance_MustHaveAccessToAllCourses(semesterInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemesterInstance_MustBeValidLevel(semesterInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CourseCreditsSumToWorkload constraint of '<em>Semester Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEMESTER_INSTANCE__COURSE_CREDITS_SUM_TO_WORKLOAD__EEXPRESSION = "(self.courseSlots.credits -> sum()).toString()=(self.intendedWorkload).toString()";

	/**
	 * Validates the CourseCreditsSumToWorkload constraint of '<em>Semester Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterInstance_CourseCreditsSumToWorkload(SemesterInstance semesterInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SpPackage.Literals.SEMESTER_INSTANCE,
				 semesterInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "CourseCreditsSumToWorkload",
				 SEMESTER_INSTANCE__COURSE_CREDITS_SUM_TO_WORKLOAD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the AllCoursesMustBeOfferedThatSemester constraint of '<em>Semester Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSemesterInstance_AllCoursesMustBeOfferedThatSemester(SemesterInstance semesterInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		String semesterToValidate = semesterInstance.getSemester().getName();
		
		EList<CourseSlot> cs = semesterInstance.getCourseSlots();
		boolean valid = true;
		for (CourseSlot c : cs) {
			if(c instanceof ObligatoryCourseSlot) {
				EList<Semester> semester = ((ObligatoryCourseSlot) c).getCourse().getSemesterOffered();
				if(semester.size() == 2) {
					continue;
				}
				else {
					if(!semester.get(0).getName().equals(semesterToValidate)) {
						valid = false;
					}
				}
				
			}
			else if (c instanceof ElectablesCourseSlot) {
				EList<Course> courseList = ((ElectablesCourseSlot) c).getCourses();
				for (Course course : courseList) {
					EList<Semester> semester = course.getSemesterOffered();
					if(semester.size() == 2) {
						continue;
					}
					else {
						if(!semester.get(0).getName().equals(semesterToValidate)) {
							valid = false;
						}
					}
				}
			}
		}
		
		
		if (valid) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AllCoursesMustBeOfferedThatSemester", getObjectLabel(semesterInstance, context) },
						 new Object[] { semesterInstance },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the MustHaveAccessToAllCourses constraint of '<em>Semester Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSemesterInstance_MustHaveAccessToAllCourses(SemesterInstance semesterInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean valid = true;
		
		ArrayList<Course> courseList = new ArrayList<Course>();
		for( CourseSlot cs : semesterInstance.getCourseSlots()) {
			if( cs instanceof ObligatoryCourseSlot) {
				courseList.add(((ObligatoryCourseSlot) cs).getCourse());
			}
			else if( cs instanceof ElectablesCourseSlot) {
				courseList.addAll(((ElectablesCourseSlot) cs).getCourses());
			}
		}
		for (Course course : courseList) {
			if (!course.isAccessToAll() && !course.getOfferedTo().contains(semesterInstance.getStudyPlan())) {
				valid = false;
			}
		}
		
		if (valid) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "MustHaveAccessToAllCourses", getObjectLabel(semesterInstance, context) },
						 new Object[] { semesterInstance },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the MustBeValidLevel constraint of '<em>Semester Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSemesterInstance_MustBeValidLevel(SemesterInstance semesterInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean valid = true;
		
		if(semesterInstance.getStudyPlan().getLevel().getName().equals("Masters")) {
			valid = true;
		}
		else {

			ArrayList<Course> courseList = new ArrayList<Course>();
			for( CourseSlot cs : semesterInstance.getCourseSlots()) {
				if( cs instanceof ObligatoryCourseSlot) {
					courseList.add(((ObligatoryCourseSlot) cs).getCourse());
				}
				else if( cs instanceof ElectablesCourseSlot) {
					courseList.addAll(((ElectablesCourseSlot) cs).getCourses());
				}
			}
			for (Course course : courseList) {
				if(course.getLevel().getName().equals("Masters")) {
					valid = false;
				}
			}
			
		}
		
		
		
		if (valid) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "MustBeValidLevel", getObjectLabel(semesterInstance, context) },
						 new Object[] { semesterInstance },
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
	public boolean validateCourseSlot(CourseSlot courseSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseSlot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElectablesCourseSlot(ElectablesCourseSlot electablesCourseSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(electablesCourseSlot, diagnostics, context);
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

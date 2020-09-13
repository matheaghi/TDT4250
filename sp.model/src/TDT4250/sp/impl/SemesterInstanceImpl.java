/**
 */
package TDT4250.sp.impl;

import TDT4250.sp.CourseSlot;
import TDT4250.sp.Semester;
import TDT4250.sp.SemesterInstance;
import TDT4250.sp.SpPackage;
import TDT4250.sp.StudyPlan;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.sp.impl.SemesterInstanceImpl#getCourseSlots <em>Course Slots</em>}</li>
 *   <li>{@link TDT4250.sp.impl.SemesterInstanceImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link TDT4250.sp.impl.SemesterInstanceImpl#getYear <em>Year</em>}</li>
 *   <li>{@link TDT4250.sp.impl.SemesterInstanceImpl#getIntendedWorkload <em>Intended Workload</em>}</li>
 *   <li>{@link TDT4250.sp.impl.SemesterInstanceImpl#getStudyPlan <em>Study Plan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterInstanceImpl extends MinimalEObjectImpl.Container implements SemesterInstance {
	/**
	 * The cached value of the '{@link #getCourseSlots() <em>Course Slots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseSlots()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseSlot> courseSlots;

	/**
	 * The default value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected static final Semester SEMESTER_EDEFAULT = Semester.AUTUMN;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected Semester semester = SEMESTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntendedWorkload() <em>Intended Workload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedWorkload()
	 * @generated
	 * @ordered
	 */
	protected static final Float INTENDED_WORKLOAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntendedWorkload() <em>Intended Workload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedWorkload()
	 * @generated
	 * @ordered
	 */
	protected Float intendedWorkload = INTENDED_WORKLOAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpPackage.Literals.SEMESTER_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseSlot> getCourseSlots() {
		if (courseSlots == null) {
			courseSlots = new EObjectContainmentWithInverseEList<CourseSlot>(CourseSlot.class, this, SpPackage.SEMESTER_INSTANCE__COURSE_SLOTS, SpPackage.COURSE_SLOT__SEMESTER);
		}
		return courseSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester getSemester() {
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemester(Semester newSemester) {
		Semester oldSemester = semester;
		semester = newSemester == null ? SEMESTER_EDEFAULT : newSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.SEMESTER_INSTANCE__SEMESTER, oldSemester, semester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.SEMESTER_INSTANCE__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getIntendedWorkload() {
		return intendedWorkload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntendedWorkload(Float newIntendedWorkload) {
		Float oldIntendedWorkload = intendedWorkload;
		intendedWorkload = newIntendedWorkload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.SEMESTER_INSTANCE__INTENDED_WORKLOAD, oldIntendedWorkload, intendedWorkload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyPlan getStudyPlan() {
		if (eContainerFeatureID() != SpPackage.SEMESTER_INSTANCE__STUDY_PLAN) return null;
		return (StudyPlan)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyPlan(StudyPlan newStudyPlan, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStudyPlan, SpPackage.SEMESTER_INSTANCE__STUDY_PLAN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudyPlan(StudyPlan newStudyPlan) {
		if (newStudyPlan != eInternalContainer() || (eContainerFeatureID() != SpPackage.SEMESTER_INSTANCE__STUDY_PLAN && newStudyPlan != null)) {
			if (EcoreUtil.isAncestor(this, newStudyPlan))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStudyPlan != null)
				msgs = ((InternalEObject)newStudyPlan).eInverseAdd(this, SpPackage.STUDY_PLAN__SEMESTERS, StudyPlan.class, msgs);
			msgs = basicSetStudyPlan(newStudyPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.SEMESTER_INSTANCE__STUDY_PLAN, newStudyPlan, newStudyPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpPackage.SEMESTER_INSTANCE__COURSE_SLOTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourseSlots()).basicAdd(otherEnd, msgs);
			case SpPackage.SEMESTER_INSTANCE__STUDY_PLAN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStudyPlan((StudyPlan)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpPackage.SEMESTER_INSTANCE__COURSE_SLOTS:
				return ((InternalEList<?>)getCourseSlots()).basicRemove(otherEnd, msgs);
			case SpPackage.SEMESTER_INSTANCE__STUDY_PLAN:
				return basicSetStudyPlan(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SpPackage.SEMESTER_INSTANCE__STUDY_PLAN:
				return eInternalContainer().eInverseRemove(this, SpPackage.STUDY_PLAN__SEMESTERS, StudyPlan.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpPackage.SEMESTER_INSTANCE__COURSE_SLOTS:
				return getCourseSlots();
			case SpPackage.SEMESTER_INSTANCE__SEMESTER:
				return getSemester();
			case SpPackage.SEMESTER_INSTANCE__YEAR:
				return getYear();
			case SpPackage.SEMESTER_INSTANCE__INTENDED_WORKLOAD:
				return getIntendedWorkload();
			case SpPackage.SEMESTER_INSTANCE__STUDY_PLAN:
				return getStudyPlan();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpPackage.SEMESTER_INSTANCE__COURSE_SLOTS:
				getCourseSlots().clear();
				getCourseSlots().addAll((Collection<? extends CourseSlot>)newValue);
				return;
			case SpPackage.SEMESTER_INSTANCE__SEMESTER:
				setSemester((Semester)newValue);
				return;
			case SpPackage.SEMESTER_INSTANCE__YEAR:
				setYear((Integer)newValue);
				return;
			case SpPackage.SEMESTER_INSTANCE__INTENDED_WORKLOAD:
				setIntendedWorkload((Float)newValue);
				return;
			case SpPackage.SEMESTER_INSTANCE__STUDY_PLAN:
				setStudyPlan((StudyPlan)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpPackage.SEMESTER_INSTANCE__COURSE_SLOTS:
				getCourseSlots().clear();
				return;
			case SpPackage.SEMESTER_INSTANCE__SEMESTER:
				setSemester(SEMESTER_EDEFAULT);
				return;
			case SpPackage.SEMESTER_INSTANCE__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case SpPackage.SEMESTER_INSTANCE__INTENDED_WORKLOAD:
				setIntendedWorkload(INTENDED_WORKLOAD_EDEFAULT);
				return;
			case SpPackage.SEMESTER_INSTANCE__STUDY_PLAN:
				setStudyPlan((StudyPlan)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpPackage.SEMESTER_INSTANCE__COURSE_SLOTS:
				return courseSlots != null && !courseSlots.isEmpty();
			case SpPackage.SEMESTER_INSTANCE__SEMESTER:
				return semester != SEMESTER_EDEFAULT;
			case SpPackage.SEMESTER_INSTANCE__YEAR:
				return year != YEAR_EDEFAULT;
			case SpPackage.SEMESTER_INSTANCE__INTENDED_WORKLOAD:
				return INTENDED_WORKLOAD_EDEFAULT == null ? intendedWorkload != null : !INTENDED_WORKLOAD_EDEFAULT.equals(intendedWorkload);
			case SpPackage.SEMESTER_INSTANCE__STUDY_PLAN:
				return getStudyPlan() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (semester: ");
		result.append(semester);
		result.append(", year: ");
		result.append(year);
		result.append(", intendedWorkload: ");
		result.append(intendedWorkload);
		result.append(')');
		return result.toString();
	}

} //SemesterInstanceImpl

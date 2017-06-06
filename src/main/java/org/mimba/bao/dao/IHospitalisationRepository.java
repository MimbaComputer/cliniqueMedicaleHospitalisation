package org.mimba.bao.dao;

import java.util.Date;

import org.mimba.bao.entities.Hospitalisation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IHospitalisationRepository extends JpaRepository<Hospitalisation, Long> {

	public Page<Hospitalisation> findById(@Param("id") Long id, Pageable pageable);

	public Page<Hospitalisation> findByDate(@Param("date") Date date, Pageable pageable);

	@Query("select h from Hospitalisation h where h.patient.id=:id")
	public Page<Hospitalisation> patientHospitalisationParId(@Param("id") Long id, Pageable pageable);

//	@Query("select h from Hospitalisation h where h.salle.id=:id")
//	public Page<Hospitalisation> salleHospitalisationParId(@Param("id") Long id, Pageable pageable);

//	@Query("select hs from HOSP_SALL hs where hs.NUM_HOSP=:idhosp and hs.NUM_SALL=:idsall")
//	public Page<Hospitalisation> salleHOSP_SALLParId(@Param("idhosp") Long idhosp,
//													 @Param("idsall") Long idsall, Pageable pageable);

}

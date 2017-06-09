package org.mimba.bao.dao;

import java.util.Date;

import org.mimba.bao.entities.Salle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ISalleRepository extends JpaRepository<Salle, Long> {

	public Page<Salle> findById(@Param("id") Long id, Pageable pageable);

	public Page<Salle> findByNom(@Param("nom") String nom, Pageable pageable);

	public Page<Salle> findByCapacite(@Param("capacite") int capacite, Pageable pageable);

	public Page<Salle> findByContenue(@Param("contenue") int contenue, Pageable pageable);

	public Page<Salle> findByDescription(@Param("description") String description, Pageable pageable);

	public Page<Salle> findByDisponible(@Param("disponible") boolean disponible, Pageable pageable);

	@Query("select s from Salle s where s.nom like:mc")
	public Page<Salle> nomSalleParMC(@Param("mc") String mc, Pageable pageable);

	@Query("select s from Salle s where s.description like:mc")
	public Page<Salle> descriptionSalleParMC(@Param("mc") String mc, Pageable pageable);

//	@Query("select s from Salle s where s.hospitalisation.id=:id")
//	public Page<Salle> hospitalisationSalleParId(@Param("id") Long id, Pageable pageable);

//	@Query("select hs from HOSP_SALL hs where hs.NUM_HOSP=:idhosp and hs.NUM_SALL=:idsall")
//	public Page<Salle> hospitalisationHOSP_SALLParId(@Param("idhosp") Long idhosp, @Param("idsall") Long idsall,
//			Pageable pageable);
}

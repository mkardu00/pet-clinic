package marija.springframework.petclinic.services;

import marija.springframework.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}

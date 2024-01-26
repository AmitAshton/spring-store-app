package com.store.backend.assembler;

import com.store.backend.controller.CustomerController;
import com.store.backend.data.dto.CustomerDto;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.SimpleRepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class CustomerDtoAssembler implements SimpleRepresentationModelAssembler<CustomerDto> {
    /**
     * This class represents an assembler for the costumer links
     * like getting a specific costumer, getting all costumers and getting costumers by their full name
     */
    @Override
    public void addLinks(EntityModel<CustomerDto> resource) {
        resource.add(linkTo(methodOn(CustomerController.class)
                .getCustomer(resource.getContent().getId())).withSelfRel());
        resource.add(linkTo(methodOn(CustomerController.class).getAllCustomers()).withRel("customers"));
        resource.add(linkTo(methodOn(CustomerController.class).getAllCustomersLike(resource.getContent().getFullName())).withRel("customerByName"));
    }

    @Override
    public void addLinks(CollectionModel<EntityModel<CustomerDto>> resources) {
        resources.add(linkTo(methodOn(CustomerController.class).getAllCustomers()).withSelfRel());

    }
}

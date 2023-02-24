package com.ajavacode.phonebooksystem.controller

import com.ajavacode.phonebooksystem.model.Contact
import com.ajavacode.phonebooksystem.service.ContactService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/contacts")
class ContactController(private val contactService: ContactService) {

    @GetMapping
    fun getAllContacts(): MutableIterable<Contact> {
        return contactService.getAllContacts()
    }

    @GetMapping("/{id}")
    fun getContactById(@PathVariable("id") id: Long): ResponseEntity<Contact> {
        return contactService.getContactById(id)
    }

    @PostMapping
    fun createContact(@RequestBody contact: Contact): ResponseEntity<Contact> {
        return contactService.createContact(contact)
    }

    @DeleteMapping("/{id}")
    fun deleteContactById(@PathVariable("id") id: Long) {
        contactService.deleteContactById(id)
    }
}
package com.ajavacode.phonebooksystem.service

import com.ajavacode.phonebooksystem.model.Contact
import com.ajavacode.phonebooksystem.repository.ContactRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.net.URI

@Service
class ContactService(private val contactRepository: ContactRepository) {

    fun getAllContacts(): MutableIterable<Contact> {
        return contactRepository.findAll()
    }

    fun getContactById(id: Long): ResponseEntity<Contact> {
        val contact = contactRepository.findById(id).orElse(null)
        return if (contact != null) {
            ResponseEntity.ok(contact)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    fun createContact(contact: Contact): ResponseEntity<Contact> {
        val createdContact = contactRepository.save(contact)
        return ResponseEntity.created(URI("/contacts/${createdContact.id}")).body(createdContact)
    }

    fun deleteContactById(id: Long): ResponseEntity<Void> {
        contactRepository.deleteById(id)
        return ResponseEntity.noContent().build()
    }
}
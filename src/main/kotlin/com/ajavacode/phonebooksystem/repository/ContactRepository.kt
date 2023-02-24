package com.ajavacode.phonebooksystem.repository

import com.ajavacode.phonebooksystem.model.Contact
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ContactRepository : JpaRepository<Contact, Long> {
}
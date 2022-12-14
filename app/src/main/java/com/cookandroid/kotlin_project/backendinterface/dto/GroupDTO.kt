package com.cookandroid.kotlin_project.backendinterface.dto

data class GroupDTO (
    val groupId: String = "",
    val name: String = "",
    val password: String = "",
    val participants: List<MemberDTO> ?= null
)
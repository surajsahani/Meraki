package com.androidhacks.meraki.models

data class PathwayDTO(
    val pathway: Pathway
)
data class Summary(
    val component: String,
    val value: String
)
data class Pathway(
    val code: String,
    val courses: List<Course>,
    val createdAt: String,
    val description: String,
    val id: Int,
    val locale: String,
    val logo: String,
    val name: String,
    val outcomes: List<Outcome>,
    val platform: String,
    val publishedAt: String,
    val slug: Any,
    val sub_description: String,
    val sub_heading: Any,
    val summary: List<Summary>,
    val type: String,
    val updatedAt: String,
    val video_link: String
)
data class Outcome(
    val component: String,
    val value: String
)
data class Course(
    val completed_portion: Int,
    val id: Int,
    val lang_available: List<String>,
    val logo: String,
    val name: String,
    val short_description: String
)
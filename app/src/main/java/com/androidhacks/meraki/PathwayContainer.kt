package com.androidhacks.meraki

data class PathwayContainer(
    val pathways: List<Pathway>
)
data class Pathway(
    val code: String,
    val courses: List<Course>,
    val created_at: String,
    val cta: Cta,
    val description: String,
    val id: Int,
    val lang_available: List<LangAvailable>,
    val logo: String,
    val milestones: List<Any>,
    val name: String,
    val shouldShowCertificate: Boolean,
    val tracking_day_of_week: Int,
    val tracking_days_lock_before_cycle: Int,
    val tracking_enabled: Boolean,
    val tracking_frequency: String
)
data class LangAvailable(
    val code: String,
    val label: String
)
data class Cta(
    val url: String,
    val value: String
)
data class Course(
    val completed_portion: Int,
    val course_type: String,
    val days_to_complete: Any,
    val id: String,
    val lang_available: List<String>,
    val logo: String,
    val name: String,
    val notes: Any,
    val short_description: String,
    val type: String
)
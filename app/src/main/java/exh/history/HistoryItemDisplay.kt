// Display partial chapter progress if chapter is not fully read.
fun getChapterProgressDisplay(currentPage: Int, totalPages: Int): String {
    return if (currentPage < totalPages) "Page: $currentPage" else ""
}


package org.koitharu.kotatsu.parsers.site.madara.ar

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaParserSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@MangaSourceParser("LIKEMANGANET", "MangaLek", "ar")
internal class LikeMangaNet(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LIKEMANGANET, "like-manga.net", pageSize = 10)

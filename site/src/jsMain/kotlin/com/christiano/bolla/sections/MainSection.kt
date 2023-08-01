package com.christiano.bolla.sections

import androidx.compose.runtime.Composable
import com.christiano.bolla.components.Header
import com.christiano.bolla.models.Section
import com.christiano.bolla.utils.Constants.SECTION_WIDTH
import com.christiano.bolla.utils.Res
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.silk.components.graphics.Image
import org.jetbrains.compose.web.css.px

@Composable
fun MainSection() {
    Box(
        modifier = Modifier
            .id(Section.Home.id)
            .maxWidth(SECTION_WIDTH.px),
        contentAlignment = Alignment.TopCenter
    ) {
        MainBackground()
        Header()
    }
}

@Composable
fun MainBackground() {
    Image(
        modifier = Modifier
            .fillMaxSize()
            .objectFit(ObjectFit.Cover),
        src = Res.Image.background,
        desc = "Background Image"
    )
}
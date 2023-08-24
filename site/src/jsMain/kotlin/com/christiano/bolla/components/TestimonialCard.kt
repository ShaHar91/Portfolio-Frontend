package com.christiano.bolla.components

import androidx.compose.runtime.Composable
import com.christiano.bolla.models.Testimonial
import com.christiano.bolla.models.Theme
import com.christiano.bolla.utils.Constants
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.toSilkPalette
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun TestimonialCard(
    modifier: Modifier = Modifier,
    testimonial: Testimonial
) {
    Backdrop(
        modifier = modifier.maxWidth(500.px).padding(20.px)
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .borderRadius(50.percent)
                    .maxWidth(80.px),
                src = testimonial.image,
                desc = "Avatar Image"
            )

            P(
                attrs = Modifier
                    .fillMaxWidth()
                    .margin(top = 10.px)
                    .fontFamily(Constants.FONT_FAMILY)
                    .color(Theme.Primary.rgb)
                    .fontWeight(FontWeight.Bold)
                    .textAlign(TextAlign.Center)
                    .toAttrs()
            ) {
                Text(testimonial.fullName)
            }

            P(
                attrs = Modifier
                    .fillMaxWidth()
                    .textAlign(TextAlign.Center)
                    .margin(top = 0.px, bottom = 10.px)
                    .fontFamily(Constants.FONT_FAMILY)
                    .fontSize(14.px)
                    .color(ColorMode.current.toSilkPalette().color.darkened(0.5f))
                    .fontWeight(FontWeight.Normal)
                    .toAttrs()
            ) {
                Text(testimonial.profession)
            }

            P(
                attrs = Modifier
                    .fillMaxWidth()
                    .margin(topBottom = 0.px)
                    .textAlign(TextAlign.Center)
                    .fontFamily(Constants.FONT_FAMILY)
                    .fontWeight(FontWeight.Normal)
                    .toAttrs()
            ) {
                Text(testimonial.review)
            }
        }
    }
}
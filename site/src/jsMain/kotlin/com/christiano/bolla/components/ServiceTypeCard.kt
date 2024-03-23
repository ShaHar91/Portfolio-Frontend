package com.christiano.bolla.components

import androidx.compose.runtime.Composable
import com.christiano.bolla.models.Service
import com.christiano.bolla.styles.ServicesTypeCardStyle
import com.christiano.bolla.styles.onSurfaceVariant
import com.christiano.bolla.styles.primary
import com.christiano.bolla.styles.surfaceVariant
import com.christiano.bolla.utils.Constants
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.palette.toPalette
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun ServiceTypeCard(
    service: Service
) {
    Link(
        "#${service.id}",
        ServicesTypeCardStyle.toModifier()
            .fillMaxWidth()
            .textDecorationLine(TextDecorationLine.None)
    ) {
        Column(
            Modifier
                .borderRadius(12.px)
                .padding(topBottom = 24.px, leftRight = 16.px)
                .backgroundColor(ColorMode.current.toPalette().surfaceVariant)
                .color(ColorMode.current.toPalette().onSurfaceVariant),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            service.getServiceTypeIcon(ColorMode.current.toPalette().primary, Modifier.size(56.px))

            Spacer(Modifier.height(10.px))

            P(
                attrs = Modifier
                    .fillMaxWidth()
                    .textAlign(TextAlign.Center)
                    .margin(topBottom = 0.px)
                    .fontFamily(Constants.FONT_FAMILY)
                    .fontSize(22.px)
                    .toAttrs()
            ) {
                Text(service.title)
            }
        }
    }
}
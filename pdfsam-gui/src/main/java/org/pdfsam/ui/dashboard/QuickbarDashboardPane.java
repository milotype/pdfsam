/* 
 * This file is part of the PDF Split And Merge source code
 * Created on 02/mag/2014
 * Copyright 2013-2014 by Andrea Vacondio (andrea.vacondio@gmail.com).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as 
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.pdfsam.ui.dashboard;

import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import javax.inject.Inject;
import javax.inject.Named;

import org.pdfsam.ui.quickbar.ExpandButton;

/**
 * Vertical panel holding the quick navigation icons to access dashboard items and an expand button to show descriptions.
 * 
 * @author Andrea Vacondio
 *
 */
@Named
class QuickbarDashboardPane extends VBox {

    @Inject
    public QuickbarDashboardPane(ExpandButton expandButton, QuickbarDashboardButtons items) {
        getStyleClass().add("quickbar");
        items.displayTextProperty().bind(expandButton.selectedProperty());
        VBox buttonContainer = new VBox(expandButton, items);
        buttonContainer.getStyleClass().add("quickbar-buttons");
        setVgrow(buttonContainer, Priority.ALWAYS);
        getChildren().addAll(buttonContainer);
    }
}

/*
 * SonarQube, open source software quality management tool.
 * Copyright (C) 2008-2014 SonarSource
 * mailto:contact AT sonarsource DOT com
 *
 * SonarQube is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * SonarQube is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.server.db.migrations;

import org.sonar.core.platform.Module;
import org.sonar.server.db.migrations.v451.AddMissingCustomRuleParametersMigrationStep;
import org.sonar.server.db.migrations.v451.DeleteUnescapedActivities;
import org.sonar.server.db.migrations.v50.FeedFileSources;
import org.sonar.server.db.migrations.v50.FeedIssueLongDates;
import org.sonar.server.db.migrations.v50.FeedSnapshotSourcesUpdatedAt;
import org.sonar.server.db.migrations.v50.InsertProjectsAuthorizationUpdatedAtMigrationStep;
import org.sonar.server.db.migrations.v50.PopulateProjectsUuidColumnsMigrationStep;
import org.sonar.server.db.migrations.v50.RemoveSortFieldFromIssueFiltersMigrationStep;
import org.sonar.server.db.migrations.v50.ReplaceIssueFiltersProjectKeyByUuid;
import org.sonar.server.db.migrations.v51.AddIssuesColumns;
import org.sonar.server.db.migrations.v51.AddNewCharacteristics;
import org.sonar.server.db.migrations.v51.CopyScmAccountsFromAuthorsToUsers;
import org.sonar.server.db.migrations.v51.DropIssuesColumns;
import org.sonar.server.db.migrations.v51.FeedAnalysisReportsLongDates;
import org.sonar.server.db.migrations.v51.FeedEventsLongDates;
import org.sonar.server.db.migrations.v51.FeedFileSourcesBinaryData;
import org.sonar.server.db.migrations.v51.FeedIssueChangesLongDates;
import org.sonar.server.db.migrations.v51.FeedIssueComponentUuids;
import org.sonar.server.db.migrations.v51.FeedIssueTags;
import org.sonar.server.db.migrations.v51.FeedIssuesLongDates;
import org.sonar.server.db.migrations.v51.FeedManualMeasuresLongDates;
import org.sonar.server.db.migrations.v51.FeedSnapshotsLongDates;
import org.sonar.server.db.migrations.v51.FeedUsersLongDates;
import org.sonar.server.db.migrations.v51.RemovePermissionsOnModulesMigrationStep;
import org.sonar.server.db.migrations.v51.RenameComponentRelatedParamsInIssueFilters;
import org.sonar.server.db.migrations.v51.UpdateProjectsModuleUuidPath;
import org.sonar.server.db.migrations.v52.AddManualMeasuresComponentUuidColumn;
import org.sonar.server.db.migrations.v52.FeedEventsComponentUuid;
import org.sonar.server.db.migrations.v52.FeedFileSourcesDataType;
import org.sonar.server.db.migrations.v52.FeedManualMeasuresComponentUuid;
import org.sonar.server.db.migrations.v52.FeedMetricsBooleans;
import org.sonar.server.db.migrations.v52.FeedProjectLinksComponentUuid;
import org.sonar.server.db.migrations.v52.MoveProjectProfileAssociation;
import org.sonar.server.db.migrations.v52.RemoveComponentLibraries;
import org.sonar.server.db.migrations.v52.RemoveDuplicatedComponentKeys;
import org.sonar.server.db.migrations.v52.RemoveSnapshotLibraries;

public class MigrationStepModule extends Module {
  @Override
  protected void configureModule() {
    add(
      // 4.5.1
      AddMissingCustomRuleParametersMigrationStep.class,
      DeleteUnescapedActivities.class,

      // 5.0
      InsertProjectsAuthorizationUpdatedAtMigrationStep.class,
      PopulateProjectsUuidColumnsMigrationStep.class,
      ReplaceIssueFiltersProjectKeyByUuid.class,
      FeedSnapshotSourcesUpdatedAt.class,
      FeedFileSources.class,
      FeedIssueLongDates.class,
      RemoveSortFieldFromIssueFiltersMigrationStep.class,

      // 5.1
      FeedIssueTags.class,
      FeedUsersLongDates.class,
      RenameComponentRelatedParamsInIssueFilters.class,
      CopyScmAccountsFromAuthorsToUsers.class,
      FeedIssueChangesLongDates.class,
      FeedAnalysisReportsLongDates.class,
      UpdateProjectsModuleUuidPath.class,
      FeedIssueComponentUuids.class,
      FeedSnapshotsLongDates.class,
      FeedIssuesLongDates.class,
      FeedFileSourcesBinaryData.class,
      FeedManualMeasuresLongDates.class,
      FeedEventsLongDates.class,
      AddNewCharacteristics.class,
      RemovePermissionsOnModulesMigrationStep.class,
      AddIssuesColumns.class,
      DropIssuesColumns.class,

      // 5.2
      FeedProjectLinksComponentUuid.class,
      FeedEventsComponentUuid.class,
      MoveProjectProfileAssociation.class,
      FeedFileSourcesDataType.class,
      FeedMetricsBooleans.class,
      AddManualMeasuresComponentUuidColumn.class,
      FeedManualMeasuresComponentUuid.class,
      RemoveSnapshotLibraries.class,
      RemoveComponentLibraries.class,
      RemoveDuplicatedComponentKeys.class);
  }
}

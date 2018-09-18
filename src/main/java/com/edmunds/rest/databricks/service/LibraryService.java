/*
 * Copyright 2018 Edmunds.com, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.edmunds.rest.databricks.service;

import com.edmunds.rest.databricks.DTO.ClusterLibraryStatusesDTO;
import com.edmunds.rest.databricks.DTO.LibraryDTO;
import com.edmunds.rest.databricks.DatabricksRestException;
import java.io.IOException;

/**
 * The wrapper around the databricks Library API.
 * https://docs.databricks.com/api/latest/libraries.html
 */
public interface LibraryService {

  ClusterLibraryStatusesDTO[] allClusterStatuses() throws IOException, DatabricksRestException;

  ClusterLibraryStatusesDTO clusterStatus(String clusterId)
      throws IOException, DatabricksRestException;

  void install(String clusterId, LibraryDTO[] libraries)
      throws IOException, DatabricksRestException;

  void uninstall(String clusterId, LibraryDTO[] libraries)
      throws IOException, DatabricksRestException;
}

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

import com.edmunds.rest.databricks.DTO.DbfsReadDTO;
import com.edmunds.rest.databricks.DTO.FileInfoDTO;
import com.edmunds.rest.databricks.DatabricksRestException;
import java.io.IOException;
import java.io.InputStream;

/**
 * A wrapper around the databricks DbfsService.
 * https://docs.databricks.com/api/latest/dbfs.html
 */
public interface DbfsService {

  void rm(String path, boolean recursive) throws IOException, DatabricksRestException;

  FileInfoDTO getInfo(String path) throws IOException, DatabricksRestException;

  FileInfoDTO[] ls(String path) throws IOException, DatabricksRestException;

  void mkdirs(String path) throws IOException, DatabricksRestException;

  void mv(String sourcePath, String destinationPath) throws IOException, DatabricksRestException;

  void write(String path, InputStream inputStream, boolean overwrite)
      throws IOException, DatabricksRestException;

  DbfsReadDTO read(String path, long offset, long length)
      throws IOException, DatabricksRestException;

  DbfsReadDTO read(String path) throws IOException, DatabricksRestException;

}
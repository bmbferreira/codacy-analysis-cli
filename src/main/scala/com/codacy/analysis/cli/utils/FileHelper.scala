package com.codacy.analysis.cli.utils

import java.nio.file.Path

import better.files.File

object FileHelper {
  def relativePath(filename: String): Path = File.currentWorkingDirectory.relativize(File(filename))
}

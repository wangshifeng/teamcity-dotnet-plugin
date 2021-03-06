/*
 * Copyright 2000-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * See LICENSE in the project root for license information.
 */

package jetbrains.buildServer.dotnet

/**
 * Provides arguments to the utility.
 */
interface ArgumentsProvider {
    fun getArguments(parameters: Map<String, String>): List<String>
}

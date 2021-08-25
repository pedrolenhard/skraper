/*
 * Copyright (c) 2019-present Mikhael Sokolov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.sokomishalov.skraper.provider.facebook

import kotlinx.coroutines.flow.Flow
import ru.sokomishalov.skraper.model.PageInfo
import ru.sokomishalov.skraper.model.Post


/**
 * @author sokomishalov
 */

fun FacebookSkraper.getCommunityPosts(community: String): Flow<Post> {
    return getPosts(uri = "/${community}/posts")
}

suspend fun FacebookSkraper.getCommunityInfo(community: String): PageInfo? {
    return getPageInfo(uri = "/${community}")
}

fun FacebookSkraper.getUserPosts(username: String): Flow<Post> {
    return getPosts(uri = "/${username}/posts")
}

suspend fun FacebookSkraper.getUserInfo(username: String): PageInfo? {
    return getPageInfo(uri = "/${username}")
}
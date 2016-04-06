/*
 * Copyright 2015 Guillaume EHRET
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
package com.ehret.mixit.domain;

/**
 * Differents fichiers Json recuperes sur le site Mix-it
 */
public enum JsonFile {
    FileTest(TypeFile.test, "https://www.mix-it.fr/api/session/2692"),
    FileSpeaker(TypeFile.speaker, "https://www.mix-it.fr/api/member/speaker"),
    FileSpeakerLT(TypeFile.speakerlt, "https://www.mix-it.fr/api/member/speaker/lightningtalks"),
    FileStaff(TypeFile.staff, "https://www.mix-it.fr/api/member/staff"),
    FileMembers(TypeFile.members, "https://www.mix-it.fr/api/member"),
    FileTalks(TypeFile.talks, "https://www.mix-it.fr/api/session"),
    FileSponsor(TypeFile.sponsor, "https://www.mix-it.fr/api/member/sponsor"),
    FileFavorites(TypeFile.favorites, "http://www.mix-it.fr/api/members/%d/favorites");

    private String url;
    private TypeFile type;

    private JsonFile(TypeFile type, String url) {
        this.url = url;
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public TypeFile getType() {
        return type;
    }
}

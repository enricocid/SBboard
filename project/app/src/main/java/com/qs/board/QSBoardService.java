// Copyright 2016 Google Inc.
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
// 
//      http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.qs.board;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.service.quicksettings.TileService;

@SuppressLint("Override")
public class QSBoardService
        extends TileService {

    @Override
    public void onTileAdded() {

    }

    @Override
    public void onStartListening() {

    }

    @Override
    public void onClick() {

        Intent dialog = new Intent(this, BoardActivity.class);
        startActivityAndCollapse(dialog);
    }

    @Override
    public void onStopListening() {
    }

    @Override
    public void onTileRemoved() {
    }
}

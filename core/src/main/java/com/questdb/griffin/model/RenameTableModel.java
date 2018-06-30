/*******************************************************************************
 *    ___                  _   ____  ____
 *   / _ \ _   _  ___  ___| |_|  _ \| __ )
 *  | | | | | | |/ _ \/ __| __| | | |  _ \
 *  | |_| | |_| |  __/\__ \ |_| |_| | |_) |
 *   \__\_\\__,_|\___||___/\__|____/|____/
 *
 * Copyright (C) 2014-2018 Appsicle
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 ******************************************************************************/

package com.questdb.griffin.model;

import com.questdb.griffin.SqlNode;
import com.questdb.std.Mutable;
import com.questdb.std.ObjectFactory;

public class RenameTableModel implements Mutable, ExecutionModel {
    public static final ObjectFactory<RenameTableModel> FACTORY = RenameTableModel::new;

    private SqlNode from;
    private SqlNode to;

    private RenameTableModel() {
    }

    @Override
    public void clear() {
        from = to = null;
    }

    public SqlNode getFrom() {
        return from;
    }

    public void setFrom(SqlNode from) {
        this.from = from;
    }

    @Override
    public int getModelType() {
        return ExecutionModel.RENAME_TABLE;
    }

    public SqlNode getTo() {
        return to;
    }

    public void setTo(SqlNode to) {
        this.to = to;
    }
}

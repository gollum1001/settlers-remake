/*
 * Copyright (c) 2017
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 */

package jsettlers.main.android.core.controls;

import jsettlers.common.action.EActionType;
import jsettlers.common.action.Action;
import jsettlers.graphics.action.ActionFireable;

import android.view.View;

/**
 * Created by tompr on 13/01/2017.
 */
public class ActionClickListener implements View.OnClickListener {
	private final ActionFireable actionFireable;
	private final Action action;

	public ActionClickListener(ActionFireable actionFireable, EActionType actionType) {
		this(actionFireable, new Action(actionType));
	}

	public ActionClickListener(ActionFireable actionFireable, Action action) {
		this.actionFireable = actionFireable;
		this.action = action;
	}

	@Override
	public void onClick(View view) {
		actionFireable.fireAction(action);
	}
}

/**
 * Copyright (c) 2013-2016, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.samples.store.rest.product;

import org.seedstack.business.finder.Finder;
import org.seedstack.business.finder.Range;
import org.seedstack.business.finder.Result;

@Finder
public interface ProductRepresentationFinder {

    Result<ProductRepresentation> findProductsFromCategory(Range range, long categoryId);

    Result<ProductRepresentation> findProducts(Range range, String filter);

}

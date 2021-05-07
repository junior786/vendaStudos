import { type } from "node:os";

export type SaleSum = {
    sum: number;
    sellerName: string;
}

export type SaleSuccess = {
    name: string;
    visited: number;
    deals: number;
}
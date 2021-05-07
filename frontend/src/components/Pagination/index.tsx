import { SalePage } from "types/sale";

type Props = {
    Page: SalePage;
    onPageChange: Function;
}

const Pagination = ({ Page, onPageChange }: Props) => {

    return (
        <div className="row d-flex justify-content-center">
            <nav>
                <ul className="pagination">
                    <li className={`page-item ${Page.first ? 'disabled' : ''}`}>
                        <button className="page-link" onClick={() => onPageChange(Page.number - 1)}>Anterior</button>
                    </li>
                    <li className="page-item disabled">
                        <span className="page-link">{Page.number + 1}</span>
                    </li>
                    <li className={`page-item ${Page.last ? 'disabled' : ''}`}>
                        <button className="page-link" onClick={() => onPageChange(Page.number + 1)}>Próxima</button>
                    </li>
                </ul>
            </nav>
        </div>
    )
};
export default Pagination;